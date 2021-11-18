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
    private double longitude;
    private double latitude;
    private String address;

    public static TestPost P1(User user) {
        return TestPost.builder()
                .user(user)
                .content("Posts content Test")
                .imageKey("img.png")
                .likesCount(0)
                .commentsCount(0)
                .longitude(33.450701)
                .latitude(126.570667)
                .address("any address")
                .build();
    }

    @Builder
    public TestPost(User user, String content, String imageKey, int likesCount, int commentsCount, double longitude, double latitude, String address){
        this.user = user;
        this.content = content;
        this.imageKey = imageKey;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
    }

    public Post toPost() {
        return Post.builder()
            .user(user)
            .contents(content)
            .imageKey(imageKey)
            .likesCount(likesCount)
            .commentsCount(commentsCount)
            .latitude(latitude)
            .longitude(longitude)
            .address(address)
            .build();
    }
}
