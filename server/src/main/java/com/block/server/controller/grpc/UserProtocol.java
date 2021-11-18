package com.block.server.controller.grpc;


import com.block.server._generated.proto.userservice.*;
import com.block.server.exception.UserNotFoundException;
import com.block.server.service.UserService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

@Slf4j
@RequiredArgsConstructor
@GRpcService
public class UserProtocol extends UserProtocolGrpc.UserProtocolImplBase {

    private final UserService userService;

    @Override
    public void signIn(SignInRequest request, StreamObserver<SignInResponse> responseObserver) {
        SignInResponse response;
        try {
            response = userService.signIn(request);
        } catch (UserNotFoundException ex) {
            response = SignInResponse.newBuilder()
                    .setStatus(SignInResponse.SignInStatus.NO_ACCOUNT)
                    .build();
            log.error("[SignInRequest] Failed to find user of " + request.getEmail(), ex);
        } catch (Exception ex) {
            response = SignInResponse.newBuilder()
                    .setStatus(SignInResponse.SignInStatus.INTERNAL_ERROR)
                    .build();
            log.error("[SignInRequest] error ", ex);
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void signUp(SignUpRequest request, StreamObserver<SignUpResponse> responseObserver) {
        var response = userService.signUp(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
