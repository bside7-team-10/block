package com.block.server.helper;

import com.block.server.domain.posts.Posts;
import com.block.server.domain.user.User;
import com.block.server.domain.user.UserRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@Getter
@NoArgsConstructor
public class TestPosts {
    private User userId;
    private String contents;
    private String imageContents;
    private int likesCount;
    private int commentsCount;
    private String location;


    public static TestPosts U1(User user) {
        return TestPosts.builder()
                .userId(user)
                .contents("Posts contest Test")
                .imageContents("img.png")
                .likesCount(0)
                .commentsCount(0)
                .location("14139569.9979095")
                .build();
    }

    @Builder
    public TestPosts(User userId, String contents, String imageContents, int likesCount, int commentsCount,String location) {
        this.userId = userId;
        this.contents = contents;
        this.imageContents = imageContents;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
        this.location = location;
    }

    public Posts toPost() {
        return Posts.builder()
            .userId(userId)
            .contents(contents)
            .imageContents(imageContents)
            .likesCount(likesCount)
            .commentsCount(commentsCount)
            .location(location)
            .build();
    }
}
