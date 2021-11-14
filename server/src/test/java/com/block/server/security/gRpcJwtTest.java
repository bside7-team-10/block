package com.block.server.security;

import com.amazonaws.services.s3.AmazonS3Client;
import com.block.server._generated.proto.postservice.CreatePostRequest;
import com.block.server._generated.proto.postservice.LocationDto;
import com.block.server._generated.proto.postservice.PostProtocolGrpc;
import com.block.server._generated.proto.postservice.PostProtocolStatus;
import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.UserProtocolGrpc;
import com.block.server.domain.post.PostRepository;
import com.block.server.domain.user.UserRepository;
import com.block.server.helper.TestPost;
import com.block.server.helper.TestUser;
import io.github.majusko.grpc.jwt.data.GrpcHeader;
import io.grpc.*;
import io.grpc.stub.MetadataUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class gRpcJwtTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @MockBean
    UserRepository userRepository;

    @MockBean
    PostRepository postRepository;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    void grpcSignIntest() {
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

    @DisplayName("로그인 한 유저는 createPost를 할 수 있어야 한다")
    @Test
    void grpcCreatePostTest_Success() {
        var testUser = TestUser.U1();
        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);
        ReflectionTestUtils.setField(expectedUser, "id", 1L);

        doReturn(Optional.ofNullable(expectedUser))
                .when(userRepository)
                .findByEmail(any());

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        UserProtocolGrpc.UserProtocolBlockingStub userClient = UserProtocolGrpc.newBlockingStub(channel);

        SignInResponse signInResponse = userClient.signIn(SignInRequest
                .newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .build());

        var testPost = TestPost.P1(expectedUser).toPost();
        ReflectionTestUtils.setField(testPost, "id", 1L);
        doReturn(testPost)
                .when(postRepository)
                .save(any());

        final Metadata header = new Metadata();
        header.put(GrpcHeader.AUTHORIZATION, "Bearer " + signInResponse.getToken());

        PostProtocolGrpc.PostProtocolBlockingStub postClient = PostProtocolGrpc.newBlockingStub(channel);
        PostProtocolGrpc.PostProtocolBlockingStub postClientWithHeader = MetadataUtils.attachHeaders(postClient, header);

        var createPostRes = postClientWithHeader.createPost(CreatePostRequest
                .newBuilder()
                .setContent("hello")
                .setLocation(LocationDto
                        .newBuilder()
                        .setLong(127)
                        .setLat(38)
                        .build())
                .build());

        assertThat(createPostRes, is(notNullValue()));
        assertThat(createPostRes.getStatus(), is(equalTo(PostProtocolStatus.SUCCESS)));

        channel.shutdown();
    }

    @DisplayName("로그인 안 한 유저는 createPost를 할 수 없어야 한다")
    @Test
    void grpcCreatePostTest_fail() {
        var testUser = TestUser.U1();
        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);
        ReflectionTestUtils.setField(expectedUser, "id", 1L);

        doReturn(Optional.ofNullable(expectedUser))
                .when(userRepository)
                .findByEmail(any());

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        PostProtocolGrpc.PostProtocolBlockingStub postClient = PostProtocolGrpc.newBlockingStub(channel);

        var createPostRes = postClient.createPost(CreatePostRequest
                .newBuilder()
                .setContent("hello")
                .setLocation(LocationDto
                        .newBuilder()
                        .setLong(127)
                        .setLat(38)
                        .build())
                .build());

        assertThat(createPostRes, is(notNullValue()));
        assertThat(createPostRes.getStatus(), is(equalTo(PostProtocolStatus.NOT_AUTHORIZED)));

        channel.shutdown();
    }

}
