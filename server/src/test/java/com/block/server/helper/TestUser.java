package com.block.server.helper;

import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class TestUser {

    private String email;
    private String rawPassword;
    private String nickname;
    private String avatar;
    private String birthdayStr;
    private SignUpRequest.Gender gender;
    private String social;
    private String role;

    public static TestUser U1() {
        return TestUser.builder()
                .email("test@example.com")
                .rawPassword("12345678")
                .avatar("1.png")
                .birthdayStr("2020-01-01")
                .gender(SignUpRequest.Gender.MALE)
                .nickname("helloworld")
                .role("test-role")
                .build();
    }

    @Builder
    public TestUser(String email, String rawPassword, String nickname, String avatar, String birthdayStr, SignUpRequest.Gender gender, String social, String role) {
        this.email = email;
        this.rawPassword = rawPassword;
        this.nickname = nickname;
        this.avatar = avatar;
        this.birthdayStr = birthdayStr;
        this.gender = gender;
        this.social = social;
        this.role = role;
    }

    public User toUser() {
        return toUser("any-password", "any-url");
    }

    public User toUser(String encryptedPassword, String profileUrl) {
        return User.builder()
                .email(email)
                .password(encryptedPassword)
                .profile(profileUrl)
                .birthday(LocalDate.parse(birthdayStr))
                .gender(gender)
                .nickName(nickname)
                .roles(role)
                .build();
    }
}
