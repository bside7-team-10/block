package com.block.server.service;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server.domain.User;
import com.block.server.domain.repository.UserRepository;
import com.block.server.exception.UserNotFoundException;
import io.github.majusko.grpc.jwt.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import io.github.majusko.grpc.jwt.service.dto.JwtData;

import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;


    @Transactional
    public SignInResponse signIn(SignInRequest signInRequest)  {

        Optional<User> user = Optional.ofNullable(findByEmail(signInRequest.getEmail())
                              .orElseThrow(() -> new UserNotFoundException()));

        var jwtData = new JwtData(signInRequest.getEmail(), user.get().getRoles());
        var token = jwtService.generate(jwtData);

        checkPassword(user.get().getPassword(), signInRequest.getPassword());

        return  signInResponseMapper(user,token);

    }

    @Transactional(readOnly = true)
    public Optional<User> findByEmail(String email) {
        checkArgument(email != null, "email must be provided.");
        return userRepository.findByEmail(email);
    }

    public void checkPassword(String userPwd, String signInRequestPwd){
        checkArgument(signInRequestPwd != null, "password must be provided.");
        if (!passwordEncoder.matches(signInRequestPwd, userPwd))
            throw new UserNotFoundException();
    }

    private SignInResponse signInResponseMapper(Optional<User> user, String token) {

        SignInResponse response = SignInResponse.newBuilder()
                .setStatus(SignInResponse.SignInStatus.SUCCESS)
                .setNickname(user.get().getNickname())
                .setProfileUrl(user.get().getProfile())
                .setToken(token)
                .build();

        return  response;
    }
}
