package com.block.server.helper;

import com.block.server.domain.comments.Comments;
import com.block.server.domain.likepost.LikePost;
import com.block.server.domain.posts.Posts;
import com.block.server.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class TestLikePost {
    private User userId;
    private Posts postId;

    public static TestLikePost U1(User user, Posts post) {
        return TestLikePost.builder()
                .userId(user)
                .postId(post)
                .build();
    }

    @Builder
    public TestLikePost(User userId, Posts postId) {
        this.userId = userId;
        this.postId= postId;
    }

    public LikePost toComment() {
        return LikePost.builder()
            .userId(userId)
            .postId(postId)
            .build();
    }
}
