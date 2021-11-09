package com.block.server.service;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server._generated.proto.userservice.SignUpResponse;
import com.block.server.domain.user.User;

import java.util.Optional;

public interface UserService {
    SignInResponse signIn(SignInRequest signInRequest);
    SignUpResponse signUp(SignUpRequest request);
    Optional<User> findByEmail(String email);
    void checkPassword(String userPwd, String signInRequestPwd);
}
