package com.block.server.helper;

import com.block.server.domain.post.Post;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;


@Getter
@NoArgsConstructor
public class TestPost {
    private User userId;
    private String content;
    private String imageContents;
    private int likesCount;
    private int commentsCount;
    private Point location;

    public static TestPost P1(User user) {
        return TestPost.builder()
                .userId(user)
                .content("Posts content Test")
                .imageContents("img.png")
                .likesCount(0)
                .commentsCount(0)
                .location(new Point(33.450701, 126.570667))
                .build();
    }

    @Builder
    public TestPost(User userId, String content, String imageContents, int likesCount, int commentsCount, Point location){
        this.userId = userId;
        this.content = content;
        this.imageContents = imageContents;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.location = location;
    }

    public Post toPost() {
        return Post.builder()
            .userId(userId)
            .contents(content)
            .imageContents(imageContents)
            .likesCount(likesCount)
            .commentsCount(commentsCount)
            .location(location)
            .build();
    }
}
