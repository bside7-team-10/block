package com.block.server.domain.post;

import com.block.server.domain.user.User;
import com.google.type.LatLng;
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
    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;

    @Column(length = 2000, nullable = false)
    private String content;

    @Column
    private String imageUrl;

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
    public Post(User userId, String contents, String imageUrl, int likesCount, int commentsCount, Point location) {
        this.userId=userId;
        this.content = contents;
        this.imageUrl = imageUrl;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.location = location;
    }
}