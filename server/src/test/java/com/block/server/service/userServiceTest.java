package com.block.server.service;


import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server.domain.User;
import com.block.server.domain.repository.UserRepository;
import com.block.server.exception.UserNotFoundException;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


@SpringBootTest
public class userServiceTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    String email;
    String password;


    @BeforeEach
    void setUp() {
         email = "test4@co.kr";
         password = "1234";
    }

    private final Logger log = LoggerFactory.getLogger(getClass());


    @Test
    @DisplayName("사용자 이메일 조회")
    void findByEmail() {

        SignInRequest signInRequest = SignInRequest.newBuilder()
                .setEmail(email)
                .setPassword(passwordEncoder.encode(password))
                .build();

        var userinfo= userService.findByEmail(email).orElse(null);
        assertThat(userinfo, is(notNullValue()));
        assertThat(userinfo.getEmail(), is(email));

        log.info("사용자 이메일 조회 {}: {}", email, userinfo);

    }


    @Test
    @DisplayName("사용자 로그인")
    void signInTest() {
        SignInRequest signInRequest = SignInRequest.newBuilder()
                .setEmail(email)
                .setPassword(passwordEncoder.encode(password))
                .build();

        SignInResponse signInResponse = userService.signIn(signInRequest);

        assertThat(signInResponse, is(notNullValue()));
        assertThat(signInResponse.getToken(),is(notNullValue()));
        log.info("signInResponse = ", signInResponse);
    }


    @Test
    @DisplayName("비밀번호 틀릴 때 예외처리")
    void passwordTest() {

        SignInRequest signInRequest = SignInRequest.newBuilder()
                .setEmail(email)
                .setPassword(passwordEncoder.encode("생각대로T"))
                .build();

        assertThrows(UserNotFoundException.class, () -> userService.signIn(signInRequest));
    }

}