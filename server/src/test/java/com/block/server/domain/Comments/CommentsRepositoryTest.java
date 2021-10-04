package com.block.server.domain.Comments;

import com.block.server.domain.posts.PostRepository;
import com.block.server.domain.user.UserRepository;
import com.block.server.helper.TestComment;
import com.block.server.helper.TestPosts;
import com.block.server.helper.TestUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
public class CommentsRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentsRepository commentsRepository;

    @Test
    @DisplayName("comment를 save한다.")
    public void comment_save() {
        var user = TestUser.U1().toUser();
        userRepository.save(user);

        var posts = TestPosts.U1(user).toPost();
        postRepository.save(posts);

        var comment = TestComment.U1(user,posts).toComment();
        commentsRepository.save(comment);


        var result = commentsRepository.findById(comment.getId());

        assertThat(result, is(notNullValue()));
        assertEquals(comment.getUserId(), result.get().getUserId());
        assertEquals(comment.getPostId(), result.get().getPostId());
    }
}
