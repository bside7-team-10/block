package com.block.server.service;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server.domain.User;
import com.block.server.domain.repository.UserRepository;
import com.block.server.exception.UserNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;


@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl( UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;

    }

    @Transactional
    public SignInResponse signIn(SignInRequest signInRequest)  {
        Optional<User> user = Optional.ofNullable(findByEmail(signInRequest.getEmail())
                              .orElseThrow(() -> new UserNotFoundException()));

        checkPwd(user.get().getPassword(), signInRequest.getPassword());

        return  signInResponseMapper(user);

    }

    @Transactional(readOnly = true)
    public Optional<User> findByEmail(String email) {
        checkArgument(email != null, "email must be provided.");
        return userRepository.findByEmail(email);
    }

    public void checkPwd(String userPwd, String signInRequestPwd){
        checkArgument(signInRequestPwd != null, "password must be provided.");
        if (!passwordEncoder.matches(userPwd, signInRequestPwd))
            throw new UserNotFoundException();
    }

    private SignInResponse signInResponseMapper(Optional<User> user) {

        SignInResponse response = SignInResponse.newBuilder()
                .setStatus(SignInResponse.SignInStatus.SUCCESS)
                .setNickname(user.get().getNickname())
                .setProfileUrl(user.get().getProfile())
                .build();

        return  response;
    }
}
