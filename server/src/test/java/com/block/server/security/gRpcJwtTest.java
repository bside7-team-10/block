package com.block.server.security;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.UserProtocolGrpc;
import com.block.server.controller.grpc.UserProtocol;
import com.block.server.domain.repository.UserRepository;
import com.block.server.service.UserService;
import io.github.majusko.grpc.jwt.data.GrpcHeader;
import io.github.majusko.grpc.jwt.interceptor.AllowedCollector;
import io.github.majusko.grpc.jwt.interceptor.AuthClientInterceptor;
import io.github.majusko.grpc.jwt.interceptor.AuthServerInterceptor;
import io.github.majusko.grpc.jwt.service.JwtService;
import io.grpc.*;
import io.grpc.stub.MetadataUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

@SpringBootTest
@ActiveProfiles("test")
public class gRpcJwtTest {

    @Autowired
    private Environment environment;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AllowedCollector allowedCollector;


    @Autowired
    private AuthClientInterceptor authClientInterceptor;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    String email;
    String password;


    @BeforeEach
    void setUp() {
        email = "test2@co.kr";
        password = "1234";
    }

    private final Logger log = LoggerFactory.getLogger(getClass());

//
//    @Test
//    public void testSuccessInternalToken() throws IOException {
//
//
//        //client Envoy proxy 구축 후 , 테스트
//        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();
//        final Channel interceptedChannel = ClientInterceptors.intercept(channel,authClientInterceptor);
//        final  UserProtocolGrpc.UserProtocolBlockingStub stub = UserProtocolGrpc.newBlockingStub(interceptedChannel);
//
//        SignInResponse signInResponse = stub.signIn(SignInRequest.newBuilder()
//                .setEmail(email)
//                .setPassword(passwordEncoder.encode(password))
//                .build());
//
//
//        var header = new Metadata();
//        header.put(GrpcHeader.AUTHORIZATION, signInResponse.getToken());
//
//
//        MetadataUtils.attachHeaders(stub, header);
//
//        Assertions.assertNotNull(signInResponse);
//
//        channel.shutdown();
//    }


}
