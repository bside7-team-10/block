package com.block.server.domain.likepost;

import com.block.server.domain.post.Post;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table( name = "LikePost",
        uniqueConstraints = {
                @UniqueConstraint(
                        name="userId_postId_UNIQUE",
                        columnNames = {"userId", "postId"}
                )
        }
)
public class LikePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;

    @JoinColumn(name = "postId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Post postId;

    @Column
    @CreatedDate
    private LocalDateTime createdAt;

    @Builder
    public LikePost(User userId, Post postId) {
        this.userId=userId;
        this.postId = postId;
    }

}
