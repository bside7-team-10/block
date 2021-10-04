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

    @Autowired
    private UserRepository userRepository;

    private User userId;
    private String contents;
    private String imageContents;
    private int likesCount;
    private int commentsCount;


    public static TestPosts U1(User user) {
        return TestPosts.builder()
                .userId(user)
                .contents("Posts contest Test")
                .imageContents("img.png")
                .likesCount(0)
                .commentsCount(0)
                .build();
    }

    @Builder
    public TestPosts(User userId, String contents, String imageContents, int likesCount, int commentsCount) {
        this.userId = userId;
        this.contents = contents;
        this.imageContents = imageContents;
        this.likesCount = likesCount;
        this.commentsCount = commentsCount;
    }

    public Posts toPost() {
        return Posts.builder()
            .userId(userId)
            .contents(contents)
            .imageContents(imageContents)
            .likesCount(likesCount)
            .commentsCount(commentsCount)
            .build();
    }
}
