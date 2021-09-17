package com.block.server.gRpcTest;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.UserProtocolGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;


public class gRpcTest {


    @Test
    void grpctest()  {


        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8585)
                .usePlaintext()
                .build();


        SignInRequest signInResponse = SignInRequest.newBuilder()
                    .setEmail("tst")
                    .setPassword("tet")
                    .build();


        System.out.println("\n-----------------------------------------");
        System.out.print(signInResponse);
        System.out.println("-----------------------------------------\n");

        channel.shutdown();

    }
 }

