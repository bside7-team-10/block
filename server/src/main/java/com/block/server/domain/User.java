package com.block.server.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private String profile;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime birthday;
    private String gender;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime created_at;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime modified_at;

    @Builder
    public User(String email, String password, String nickname, String profile, LocalDateTime birthday, String gender, LocalDateTime created_at, LocalDateTime modified_at){
        this.email=email;
        this.password=password;
        this.nickname=nickname;
        this.profile=profile;
        this.birthday=birthday;
        this.gender=gender;
        this.created_at=created_at;
        this.modified_at=modified_at;
    }

}
