package com.block.server.helper;

import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server.domain.hashtag.HashTag;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class TestUser {
    private String email;
    private String rawPassword;
    private String nickname;
    private String avatarId;
    private String birthdayStr;
    private SignUpRequest.Gender gender;
    private String social;
    private String role;
    private List<String> interestHashTags;

    public static TestUser U1() {
        return TestUser.builder()
                .email("test@example.com")
                .rawPassword("12345678")
                .avatarId("1.png")
                .birthdayStr("2020-01-01")
                .gender(SignUpRequest.Gender.MALE)
                .nickname("helloworld")
                .role("test-role")
                .interestHashTags(Arrays.asList("test1", "test2"))
                .build();
    }

    @Builder
    public TestUser(String email, String rawPassword, String nickname, String avatarId, String birthdayStr, SignUpRequest.Gender gender, String social, String role, List<String> interestHashTags) {
        this.email = email;
        this.rawPassword = rawPassword;
        this.nickname = nickname;
        this.avatarId = avatarId;
        this.birthdayStr = birthdayStr;
        this.gender = gender;
        this.social = social;
        this.role = role;
        this.interestHashTags = interestHashTags;
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
                .nickname(nickname)
                .roles(role)
                .interestHashTags(interestHashTags.stream()
                        .map(x -> HashTag.builder().tagName(x).build())
                        .collect(Collectors.toList()))
                .build();
    }
}
