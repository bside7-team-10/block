package com.block.server.domain.user;

import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server.domain.hashtag.HashTag;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private String profile;

    @Column
    private LocalDate birthday;

    @Column
    private SignUpRequest.Gender gender;

    @Column
    private String social;

    @Column
    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Column
    private String roles;

    @OneToMany
    @JoinColumn(name="HASHTAG_ID")
    private List<HashTag> interestHashTags;

    @Builder
    public User(String email, String password, String nickname, String profile, LocalDate birthday, SignUpRequest.Gender gender, String social, String roles, List<HashTag> interestHashTags) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.profile = profile;
        this.birthday = birthday;
        this.gender = gender;
        this.social = social;
        this.roles = roles;
        this.interestHashTags = interestHashTags;
    }
}
