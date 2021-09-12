package com.block.server.controller.grpc;


import com.block.server._generated.proto.userservice.*;
import io.grpc.stub.StreamObserver;

public class UserProtocol implements UserProtocolGrpc.UserProtocolImplBase {
    @Override
    public void signIn(SignInRequest request, StreamObserver<SignInResponse> responseObserver) {}
    @Override
    public void signUp(SignUpRequest request, StreamObserver<SignUpResponse> responseObserver) {}
}
