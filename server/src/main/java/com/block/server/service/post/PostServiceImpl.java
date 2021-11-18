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
                .longitude(createPostRequest.getLocation().getLong())
                .latitude(createPostRequest.getLocation().getLat())
                .address(createPostRequest.getAddress())
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

        var postDto = getPostMapper(post);
        var response = GetPostResponse.newBuilder()
                .setPost(postDto)
                .setStatus(PostProtocolStatus.SUCCESS)
                .build();

        return response;

    }

    private Point KilometersToGeogrpahicDistance(int range) {
        var latDiff = range / 110.574;
        var longDiff = range / (111.320 * Math.cos(latDiff * Math.PI / 180));

        return new Point(longDiff, latDiff);
    }

    @Transactional
    @Override
    public GetPostsResponse getPosts(GetPostsRequest getPostsRequest) {
        var userLoc = getPostsRequest.getCurrentLocation();
        var range = 1; // default 1km
        if (getPostsRequest.getFilter().getDistanceFilter().getEnabled()) {
            range = getPostsRequest.getFilter().getDistanceFilter().getDistance();
        }

        var posts = postRepository.findWithLocationRange(
                PageRequest.of(getPostsRequest.getPageNumber(), getPostsRequest.getResultPerPage()),
                userLoc.getLong(),
                userLoc.getLat(),
                range);
        var response = GetPostsResponse.newBuilder();

        for (var post : posts) {
            var summary = PostSummary.newBuilder()
                    .setPostId(post.getId())
                    .setLocation(
                            LocationDto.newBuilder()
                                    .setLat(post.getLatitude())
                                    .setLong(post.getLongitude()))
                    .build();

            response.addPosts(summary);
        }
        response.setStatus(PostProtocolStatus.SUCCESS);

        return response.build();

    }

    private PostDto getPostMapper(Post post) {

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
                                .setLat(post.getLatitude())
                                .setLong(post.getLongitude()))
                .setAddress(post.getAddress())
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
