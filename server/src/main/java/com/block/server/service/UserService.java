package com.block.server.service;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server.domain.User;

import java.util.Optional;

public interface UserService {
    SignInResponse signIn(SignInRequest signInRequest);
    Optional<User> findByEmail(String email);
    void checkPwd(String userPwd, String signInRequestPwd);
}
