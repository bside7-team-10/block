package com.block.server.domain.posts;

import com.block.server._generated.proto.userservice.SignUpRequest;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="Posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;

    @Column(length = 500, nullable = false)
    private String contents;

    private String imageContents;

    private int likesCount;

    private int commentsCount;

    @Column
    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Builder
    public Posts(User userId, String contents, String imageContents,int likesCount, int commentsCount) {
        this.userId=userId;
        this.contents = contents;
        this.imageContents = imageContents;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
    }
}
