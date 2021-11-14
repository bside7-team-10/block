package com.block.server.service.post;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.post.Post;
import com.block.server.domain.post.PostRepository;
import com.block.server.exception.UserNotFoundException;
import com.block.server.service.UserService;
import com.block.server.service.postimagestorage.PostImageStorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final UserService userService;
    private final PostImageStorageService postImageStorageService;

    @Override
    @Transactional
    public CreatePostResponse createPost(CreatePostRequest createPostRequest, String userEmail) {

        var user = userService.findByEmail(userEmail)
                .orElseThrow(() -> new UserNotFoundException());
        var post = Post.builder()
                .user(user)
                .contents(createPostRequest.getContent())
                .location(new Point(createPostRequest.getLocation().getLat(), createPostRequest.getLocation().getLong()))
                .build();

        var savedPost = postRepository.save(post);

        var imageS3Key = postImageStorageService.getImageKeyForPostId(savedPost.getId());
        var presignedUrl = postImageStorageService.getUploadUrl(imageS3Key);

        CreatePostResponse response = CreatePostResponse.newBuilder()
                .setStatus(PostProtocolStatus.SUCCESS)
                .setPostId(savedPost.getId())
                .setUploadImageUrl(presignedUrl)
                .build();

        return response;
    }

    @Override
    public GetPostResponse getPost(GetPostRequest request) {

        var post = postRepository.findById(request.getPostId()).orElse(null);

        var response = GetPostResponse.newBuilder()
                .setPost(mapper(post))
                .setStatus(PostProtocolStatus.SUCCESS)
                .build();

        return response;

    }

    @Override
    public GetPostsResponse getPosts(GetPostsRequest getPostsRequest) {

        var posts = postRepository.findWithPagination(PageRequest.of(getPostsRequest.getPageNumber(), getPostsRequest.getResultPerPage()));
        var postMapper = com.block.server._generated.proto.postservice.PostDto.getDefaultInstance();
        var response = GetPostsResponse.newBuilder();

        for (var post : posts) {
            postMapper = mapper(post);
            response.addPosts(postMapper);
        }
        response.setStatus(PostProtocolStatus.SUCCESS);

        return response.build();

    }

    private PostDto mapper(Post post) {

        var imageUrl = postImageStorageService.getDownloadUrl(post.getImageKey());
        if (imageUrl.isEmpty()) {
            log.error("Post id of " + post.getId() + " doesn't have proper image key");
        }

        var ResponseMapper = PostDto.newBuilder()
                .setPostId(post.getId())
                .setAuthor(
                        com.block.server._generated.proto.postservice.UserDto.newBuilder()
                                .setNickname(post.getUser().getNickname())
                                .setProfileUrl(post.getUser().getProfile())
                )
                .setContent(post.getContent())
                .setImageUrl(imageUrl)
                .setLikes(post.getLikesCount())
                //.setComments() -- comment repeat
                .setLocation(
                        LocationDto.newBuilder()
                                .setLat(post.getLocation().getX())
                                .setLong(post.getLocation().getY()))
                .build();

        return ResponseMapper;
    }

    private UploadImageResultResponse uploadImageResultResponseWithStatus(long postId, PostProtocolStatus status) {
        return UploadImageResultResponse.newBuilder()
                .setStatus(PostProtocolStatus.SUCCESS)
                .setPostId(postId)
                .build();
    }

    @Override
    @Transactional
    public UploadImageResultResponse uploadImageResult(UploadImageResultRequest uploadImageResultRequest) {

        var post = postRepository.getById(uploadImageResultRequest.getPostId());

        if (uploadImageResultRequest.getSuccess()) {
            post.setImageKey(postImageStorageService.getImageKeyForPostId(post.getId()));
            postRepository.save(post);
            return uploadImageResultResponseWithStatus(post.getId(), PostProtocolStatus.SUCCESS);
        } else {
            try {
                postRepository.delete(post);

                return uploadImageResultResponseWithStatus(post.getId(), PostProtocolStatus.SUCCESS);
            } catch (Exception ex) {
                log.error("Failed to delete post of id " + post.getId() + ", " + ex.toString());
            }
        }
        return uploadImageResultResponseWithStatus(post.getId(), PostProtocolStatus.INTERNAL_ERROR);
    }
}
