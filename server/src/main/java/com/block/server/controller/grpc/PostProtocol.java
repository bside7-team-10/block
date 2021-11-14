package com.block.server.controller.grpc;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.user.Roles;
import com.block.server.domain.user.User;
import com.block.server.exception.NotLoggedInException;
import com.block.server.exception.UserNotFoundException;
import com.block.server.service.post.PostService;
import io.github.majusko.grpc.jwt.annotation.Allow;
import io.github.majusko.grpc.jwt.data.GrpcJwtContext;
import io.github.majusko.grpc.jwt.data.JwtContextData;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.lognet.springboot.grpc.security.GrpcSecurity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.stream.Stream;


@Slf4j
@RequiredArgsConstructor
@GRpcService
public class PostProtocol extends PostProtocolGrpc.PostProtocolImplBase {

    private final PostService postService;

    @Override
    public void createPost(CreatePostRequest request, StreamObserver<CreatePostResponse> responseObserver) {

        CreatePostResponse response;
        try {
            JwtContextData context = GrpcJwtContext.CONTEXT_DATA_KEY.get();
            if (context == null) {
                throw new NotLoggedInException();
            }
            response = postService.createPost(request, context.getUserId());
        } catch (NotLoggedInException ex) {
            response = CreatePostResponse.newBuilder()
                    .setStatus(PostProtocolStatus.NOT_AUTHORIZED)
                    .build();
        } catch (UserNotFoundException ex) {
            response = CreatePostResponse.newBuilder()
                    .setStatus(PostProtocolStatus.INTERNAL_ERROR)
                    .build();
            log.error("[CreatePost] - Context exists but no user information");
        } catch (Exception ex) {
            response = CreatePostResponse.newBuilder()
                    .setStatus(PostProtocolStatus.INTERNAL_ERROR)
                    .build();
        }

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
