package com.block.server.service.post;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.user.User;


public interface PostService {
    CreatePostResponse create(CreatePostRequest createPostRequest, User user);
    GetPostResponse getPost(GetPostRequest getPostRequest);
    GetPostsResponse getPosts(GetPostsRequest getPostsRequest);
}
