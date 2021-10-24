package com.block.server.service.post;

import com.block.server._generated.proto.postservice.CreatePostRequest;
import com.block.server._generated.proto.postservice.CreatePostResponse;
import com.block.server._generated.proto.postservice.GetPostRequest;
import com.block.server._generated.proto.postservice.GetPostResponse;


public interface PostService {
    CreatePostResponse create(CreatePostRequest createPostRequest);
    GetPostResponse getPost(GetPostRequest getPostRequest);
}
