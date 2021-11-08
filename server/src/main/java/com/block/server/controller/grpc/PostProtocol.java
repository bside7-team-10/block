package com.block.server.controller.grpc;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.user.User;
import com.block.server.service.post.PostService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.stream.Stream;


@RequiredArgsConstructor
@GRpcService
public class PostProtocol extends PostProtocolGrpc.PostProtocolImplBase {

    private final PostService postService;

    @Override
    public void createPost(CreatePostRequest request, StreamObserver<CreatePostResponse> responseObserver) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User)authentication.getPrincipal();

        var response = postService.createPost(request,user);

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getPost(GetPostRequest request, StreamObserver<GetPostResponse> responseObserver){
        var response = postService.getPost(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getPosts(GetPostsRequest request, StreamObserver<GetPostsResponse> responseObserver ){

        var response = postService.getPosts(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void uploadImageResult(UploadImageResultRequest request, StreamObserver<UploadImageResultResponse> responseObserver) {

        var response = postService.uploadImageResult(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
