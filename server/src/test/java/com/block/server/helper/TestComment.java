package com.block.server.helper;

import com.block.server.domain.Comments.Comments;
import com.block.server.domain.posts.Posts;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class TestComment {
    private User userId;
    private Posts postId;
    private String contents;

    public static TestComment U1(User user, Posts post) {
        return TestComment.builder()
                .userId(user)
                .postId(post)
                .contents("Comment Test")
                .build();
    }

    @Builder
    public TestComment(User userId, Posts postId, String contents) {
        this.userId = userId;
        this.postId= postId;
        this.contents = contents;
    }

    public Comments toComment() {
        return Comments.builder()
            .userId(userId)
            .postId(postId)
            .contents(contents)
            .build();
    }
}
