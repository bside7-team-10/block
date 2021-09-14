package com.block.server.controller.grpc;


import com.block.server._generated.proto.userservice.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserProtocol extends UserProtocolGrpc.UserProtocolImplBase {
    @Override
    public void signIn(SignInRequest request, StreamObserver<SignInResponse> responseObserver) {


        SignInResponse response = SignInResponse.newBuilder()
                .setNickname("setNcinametest")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
    @Override
    public void signUp(SignUpRequest request, StreamObserver<SignUpResponse> responseObserver) {}
}
