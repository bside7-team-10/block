package com.block.server.service.user;

import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server._generated.proto.userservice.SignUpResponse;
import com.block.server.domain.User;
import com.block.server.domain.repository.UserRepository;
import com.block.server.helper.TestUser;
import com.block.server.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

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

    @InjectMocks
    private UserService userService;

    @Test
    public void signUp_should_work() throws Exception {
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
        assertNotNull(response);
        assertEquals(SignUpResponse.SignUpStatus.SUCCESS, response.getStatus());
        assertEquals(testUser.getNickname(), response.getNickname());
        assertEquals(profileUrl, response.getProfileUrl());
    }

    @Test
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

        assertNotNull(response);
        assertEquals(SignUpResponse.SignUpStatus.ACCOUNT_EXISTS, response.getStatus());
    }
}
