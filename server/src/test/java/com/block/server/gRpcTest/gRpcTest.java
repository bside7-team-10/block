package com.block.server.gRpcTest;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.UserProtocolGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;


public class gRpcTest {

    @Test
    void grpctest(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8585)
                .usePlaintext()
                .build();

        UserProtocolGrpc.UserProtocolBlockingStub stub = UserProtocolGrpc.newBlockingStub(channel);

        SignInResponse SignInReponse = stub.signIn(SignInRequest.newBuilder()
                .setEmail("test")
                .setPassword("test")
                .build());


        System.out.println(SignInReponse.getNickname());

        channel.shutdown();

    }
 }

