package com.block.server.service.post;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.post.Post;
import com.block.server.domain.post.PostRepository;
import com.block.server.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final UserRepository userRepository;

    private final PostRepository postRepository;

    @Override
    public CreatePostResponse create(CreatePostRequest createPostRequest) {

        var user = userRepository.findByNickName(createPostRequest.getAuthor()).orElse(null);

        var post = Post.builder()
                .userId(user)
                .contents(createPostRequest.getContent())
                .imageUrl("")// temp
                .location(new Point(createPostRequest.getLocation().getLat(), createPostRequest.getLocation().getLong()))
                .build();

        var savedPost = postRepository.save(post);


        CreatePostResponse response = CreatePostResponse.newBuilder()
                .setStatus(PostProtocolStatus.SUCCESS)
                .setPostId(savedPost.getId().toString())
                .build();


        return response;
     }

    @Override
    public GetPostResponse getPost(GetPostRequest request) {

       var post =  postRepository.findById( Long.parseLong(request.getPostId())).orElse(null);


       var postResponse = com.block.server._generated.proto.postservice.Post.newBuilder()
                .setPostId(post.getId().toString())
                .setAuthor(post.getUserId().getNickName())
                .setContent(post.getContent())
                .setImageUrl("")
                .setLikes(post.getLikesCount())
                //.setComments() -- comment repeat
                .setLocation(
                        Location.newBuilder()
                                .setLat(post.getLocation().getX())
                                .setLong(post.getLocation().getY()))
                .build();



      GetPostResponse response = GetPostResponse.newBuilder()
              .setPost(postResponse)
              .setStatus(PostProtocolStatus.SUCCESS)
              .build();

     return response;
    }

}
