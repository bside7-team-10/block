package com.block.server.service.user;

import com.block.server._generated.proto.userservice.SignInRequest;
import com.block.server._generated.proto.userservice.SignInResponse;
import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server._generated.proto.userservice.SignUpResponse;
import com.block.server.domain.user.Roles;
import com.block.server.domain.user.User;
import com.block.server.domain.user.repository.UserRepository;
import com.block.server.exception.PasswordDoesNotMatchException;
import com.block.server.helper.TestUser;
import com.block.server.service.UserServiceImpl;
import io.github.majusko.grpc.jwt.service.JwtService;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Spy
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Mock
    private JwtService jwtService;

    @InjectMocks
    private UserServiceImpl userService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    private void setTestUserOnRepository(@NotNull TestUser testUser) {
        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);

        doReturn(Optional.ofNullable(expectedUser))
                .when(userRepository)
                .findByEmail(any());
    }

    private void mockJwtGeneration() {
        doReturn("test-jwt-token")
                .when(jwtService)
                .generate(any());
    }

    @Test
    @DisplayName("사용자 이메일 조회")
    public void findByEmail() {
        var testUser = TestUser.U1();
        setTestUserOnRepository(testUser);
        SignInRequest signInRequest = SignInRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .build();

        var userinfo= userService.findByEmail(testUser.getEmail()).orElse(null);

        assertThat(userinfo, is(notNullValue()));
        assertThat(userinfo.getEmail(), is(testUser.getEmail()));
        log.info("사용자 이메일 조회 {}: {}", testUser.getEmail(), userinfo);
    }


    @Test
    @DisplayName("사용자 로그인")
    void signInTest() {
        var testUser = TestUser.U1();
        setTestUserOnRepository(testUser);
        mockJwtGeneration();
        SignInRequest signInRequest = SignInRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .build();

        SignInResponse signInResponse = userService.signIn(signInRequest);

        assertThat(signInResponse, is(notNullValue()));
        assertThat(signInResponse.getToken(), is(notNullValue()));
        log.info("signInResponse = ", signInResponse);
    }


    @Test
    @DisplayName("비밀번호 틀릴 때 예외처리")
    void passwordTest() {
        var testUser = TestUser.U1();
        setTestUserOnRepository(testUser);
        mockJwtGeneration();
        SignInRequest signInRequest = SignInRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword("생각대로 T")
                .build();

        assertThrows(PasswordDoesNotMatchException.class, () -> userService.signIn(signInRequest));
    }

    @Test
    @DisplayName("회원가입 성공 시 제대로 된 response를 받아야 함")
    public void signUp_should_return_proper_response() throws Exception {
        var testUser = TestUser.U1();
        var signUpRequest = SignUpRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .setAvatar(testUser.getAvatar())
                .setBirthday(testUser.getBirthdayStr())
                .setGender(testUser.getGender())
                .setNickname(testUser.getNickname())
                .build();

        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);

        doReturn(expectedUser)
                .when(userRepository)
                .save(any());
        doReturn(Optional.empty())
                .when(userRepository)
                .findByEmail(any());

        var response = userService.signUp(signUpRequest);

        assertThat(response, is(notNullValue()));
        assertEquals(SignUpResponse.SignUpStatus.SUCCESS, response.getStatus());
        assertEquals(testUser.getNickname(), response.getNickname());
        assertEquals(profileUrl, response.getProfileUrl());
    }

    @Test
    @DisplayName("회원가입 시 비밀번호를 암호화해야 함")
    public void signUp_should_encrypt_password() throws Exception {
        var testUser = TestUser.U1();

        var signUpRequest = SignUpRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .setAvatar(testUser.getAvatar())
                .setBirthday(testUser.getBirthdayStr())
                .setGender(testUser.getGender())
                .setNickname(testUser.getNickname())
                .build();

        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);

        doReturn(expectedUser)
                .when(userRepository)
                .save(any());
        doReturn(Optional.empty())
                .when(userRepository)
                .findByEmail(any());

        var response = userService.signUp(signUpRequest);

        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);
        verify(userRepository).save(userArgumentCaptor.capture());

        assertTrue(passwordEncoder.matches(testUser.getRawPassword(), userArgumentCaptor.getValue().getPassword()));
    }

    @Test
    @DisplayName("회원가입 시 이메일이 이미 있으면 실패해야 함")
    public void signUp_should_fail_when_email_exists() throws Exception {
        var testUser = TestUser.U1();

        var signUpRequest = SignUpRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .setAvatar(testUser.getAvatar())
                .setBirthday(testUser.getBirthdayStr())
                .setGender(testUser.getGender())
                .setNickname(testUser.getNickname())
                .build();

        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var existingUser = testUser.toUser(encryptedPassword, profileUrl);

        doReturn(Optional.ofNullable(existingUser))
                .when(userRepository)
                .findByEmail(testUser.getEmail());

        var response = userService.signUp(signUpRequest);

        assertThat(response, is(notNullValue()));
        assertEquals(SignUpResponse.SignUpStatus.ACCOUNT_EXISTS, response.getStatus());
    }

    @Test
    @DisplayName("signUp 시 role이 기본으로 입력되어야 함")
    public void signUp_should_create_default_role() {
        var testUser = TestUser.U1();

        var signUpRequest = SignUpRequest.newBuilder()
                .setEmail(testUser.getEmail())
                .setPassword(testUser.getRawPassword())
                .setAvatar(testUser.getAvatar())
                .setBirthday(testUser.getBirthdayStr())
                .setGender(testUser.getGender())
                .setNickname(testUser.getNickname())
                .build();

        var encryptedPassword = passwordEncoder.encode(testUser.getRawPassword());
        var profileUrl = "http://example.com/image/" + testUser.getAvatar();
        var expectedUser = testUser.toUser(encryptedPassword, profileUrl);

        doReturn(expectedUser)
                .when(userRepository)
                .save(any());
        doReturn(Optional.empty())
                .when(userRepository)
                .findByEmail(any());

        var response = userService.signUp(signUpRequest);

        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);
        verify(userRepository).save(userArgumentCaptor.capture());

        assertEquals(Roles.USER, userArgumentCaptor.getValue().getRoles());
    }
}
