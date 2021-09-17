package com.block.server.controller.grpc;


import com.block.server._generated.proto.userservice.*;
import com.block.server.service.UserService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
@GrpcService
public class UserProtocol extends UserProtocolGrpc.UserProtocolImplBase {

    private final UserService userService;

    @Override
    public void signIn(SignInRequest request, StreamObserver<SignInResponse> responseObserver) {

        var user = userService.signIn(request);

        responseObserver.onNext(user);
        responseObserver.onCompleted();

    }
    @Override
    public void signUp(SignUpRequest request, StreamObserver<SignUpResponse> responseObserver) {}
}
