package com.block.server.service.post;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.post.Post;
import com.block.server.domain.post.PostRepository;
import com.block.server.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import static com.block.server._generated.proto.postservice.Post.*;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    @Transactional
    public CreatePostResponse create(CreatePostRequest createPostRequest, User user) {

        var post = Post.builder()
                .userId(user)
                .contents(createPostRequest.getContent())
                .imageUrl("")// temp
                .location(new Point(createPostRequest.getLocation().getLat(), createPostRequest.getLocation().getLong()))
                .build();

        var savedPost = postRepository.save(post);

        CreatePostResponse response = CreatePostResponse.newBuilder()
                .setStatus(PostProtocolStatus.SUCCESS)
                .setPostId(savedPost.getId())
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
        var postMapper = com.block.server._generated.proto.postservice.Post.getDefaultInstance();
        var response = GetPostsResponse.newBuilder();

        for (var post : posts) {
            postMapper = mapper(post);
            response.addPosts(postMapper);
        }
        response.setStatus(PostProtocolStatus.SUCCESS);

        return response.build();

    }

    private com.block.server._generated.proto.postservice.Post mapper(Post post) {

        var ResponseMapper = newBuilder()
                .setPostId(post.getId())
                .setAuthor(
                        com.block.server._generated.proto.postservice.User.newBuilder()
                                .setNickname(post.getUserId().getNickName())
                                .setProfileUrl(post.getUserId().getProfile())
                )
                .setContent(post.getContent())
                .setImageUrl("") //temp
                .setLikes(post.getLikesCount())
                //.setComments() -- comment repeat
                .setLocation(
                        Location.newBuilder()
                                .setLat(post.getLocation().getX())
                                .setLong(post.getLocation().getY()))
                .build();

        return ResponseMapper;
    }



}
