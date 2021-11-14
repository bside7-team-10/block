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
    private User user;
    private String content;
    private String imageKey;
    private int likesCount;
    private int commentsCount;
    private Point location;
    private String address;

    public static TestPost P1(User user) {
        return TestPost.builder()
                .user(user)
                .content("Posts content Test")
                .imageKey("img.png")
                .likesCount(0)
                .commentsCount(0)
                .location(new Point(33.450701, 126.570667))
                .address("나인원한남")
                .build();
    }

    @Builder
    public TestPost(User user, String content, String imageKey, int likesCount, int commentsCount, Point location, String address){
        this.user = user;
        this.content = content;
        this.imageKey = imageKey;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.location = location;
        this.address = address;
    }

    public Post toPost() {
        return Post.builder()
            .user(user)
            .contents(content)
            .imageKey(imageKey)
            .likesCount(likesCount)
            .commentsCount(commentsCount)
            .location(location)
            .address(address)
            .build();
    }
}
