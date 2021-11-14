package com.block.server.domain.post;

import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.geo.Point;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="Post")
@DynamicInsert
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column(length = 2000, nullable = false)
    private String content;

    @Column
    private String imageKey;

    @Column
    private int likesCount;

    @Column
    private int commentsCount;

    @Column
    private Point location;

    @Column
    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Builder
    public Post(User user, String contents, String imageKey, int likesCount, int commentsCount, Point location) {
        this.user = user;
        this.content = contents;
        this.imageKey = imageKey;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.location = location;
    }

    public void setImageKey(String key) {
        this.imageKey = key;
    }
}
