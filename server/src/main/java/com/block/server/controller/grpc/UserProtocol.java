package com.block.server.controller.grpc;


import com.block.server._generated.proto.userservice.*;
import com.block.server.service.UserService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class UserProtocol extends UserProtocolGrpc.UserProtocolImplBase {

    private final UserService userService;

    @Override
    public void signIn(SignInRequest request, StreamObserver<SignInResponse> responseObserver) {

        var user = userService.signIn(request);

        responseObserver.onNext(user);
        responseObserver.onCompleted();

    }
    
    @Override
    public void signUp(SignUpRequest request, StreamObserver<SignUpResponse> responseObserver) {
        var response = userService.signUp(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
