package com.block.server.controller.grpc;

import com.block.server._generated.proto.postservice.*;
import com.block.server.service.post.PostService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;


@RequiredArgsConstructor
@GRpcService
public class PostProtocol extends PostProtocolGrpc.PostProtocolImplBase {

    private final PostService postService;

    @Override
    public void createPost(CreatePostRequest request, StreamObserver<CreatePostResponse> responseObserver) {

        var response = postService.create(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getPost(GetPostRequest request, StreamObserver<GetPostResponse> responseObserver){
        var response = postService.getPost(request);

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
