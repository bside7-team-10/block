package com.block.server.service;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server._generated.proto.userservice.SignUpResponse;
import com.block.server.domain.user.Roles;
import com.block.server.domain.user.User;
import com.block.server.domain.user.repository.UserRepository;
import com.block.server.exception.PasswordDoesNotMatchException;
import com.block.server.exception.UserNotFoundException;
import io.github.majusko.grpc.jwt.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import io.github.majusko.grpc.jwt.service.dto.JwtData;

import java.time.LocalDate;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

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
            throw new PasswordDoesNotMatchException();
    }

    private SignInResponse signInResponseMapper(Optional<User> user, String token) {

        SignInResponse response = SignInResponse.newBuilder()
                .setStatus(SignInResponse.SignInStatus.SUCCESS)
                .setNickname(user.get().getNickname())
                .setProfileUrl(user.get().getProfile())
                .setToken(token)
                .build();

        return response;
    }

    @Transactional
    public SignUpResponse signUp(SignUpRequest request) {
        var signUpResponseBuilder = SignUpResponse.newBuilder();
        if (userExistsByEmail(request.getEmail())) {
            return signUpResponseBuilder
                    .setStatus(SignUpResponse.SignUpStatus.ACCOUNT_EXISTS)
                    .build();
        }

        var encodedPassword = passwordEncoder.encode(request.getPassword());
        var profileUrl = "http://example.com/image/" + request.getAvatar();
        var user = User.builder()
                .email(request.getEmail())
                .password(encodedPassword)
                .nickname(request.getNickname())
                .birthday(LocalDate.parse(request.getBirthday()))
                .gender(request.getGender())
                .profile(profileUrl)
                .social("")                 // temp
                .roles(Roles.USER)          // default role
                .build();

        var savedUser = userRepository.save(user);

        return signUpResponseBuilder
                .setStatus(SignUpResponse.SignUpStatus.SUCCESS)
                .setNickname(savedUser.getNickname())
                .setProfileUrl(savedUser.getProfile())
                .build();
    }

    private boolean userExistsByEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
