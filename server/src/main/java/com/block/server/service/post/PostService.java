package com.block.server.service.post;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.user.User;


public interface PostService {
    CreatePostResponse createPost(CreatePostRequest createPostRequest, User user);
    GetPostResponse getPost(GetPostRequest getPostRequest);
    GetPostsResponse getPosts(GetPostsRequest getPostsRequest);
    UploadImageResultResponse uploadImageResult(UploadImageResultRequest uploadImageResultRequest);
}
