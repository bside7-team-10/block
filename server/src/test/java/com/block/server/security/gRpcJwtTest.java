package com.block.server.security;

import com.amazonaws.services.s3.AmazonS3Client;
import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.UserProtocolGrpc;
import com.block.server.domain.user.UserRepository;
import com.block.server.helper.TestUser;
import io.grpc.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class gRpcJwtTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @MockBean
    UserRepository userRepository;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    void grpctest() {
        var testUser = TestUser.U1();
        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);
        doReturn(Optional.ofNullable(expectedUser))
                .when(userRepository)
                .findByEmail(any());

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        UserProtocolGrpc.UserProtocolBlockingStub stub = UserProtocolGrpc.newBlockingStub(channel);


        SignInResponse signInResponse = stub.signIn(SignInRequest
                                                    .newBuilder()
                                                    .setEmail(testUser.getEmail())
                                                    .setPassword(testUser.getRawPassword())
                                                    .build());

        assertThat(signInResponse, is(notNullValue()));

        channel.shutdown();
    }


}
