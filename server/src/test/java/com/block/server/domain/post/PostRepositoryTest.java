package com.block.server.domain.post;

import com.block.server.domain.user.UserRepository;
import com.block.server.helper.TestPost;
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
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("post를 save한다.")
    public void post_save() {
        var user = TestUser.U1().toUser();
        userRepository.save(user);

        var posts = TestPost.P1(user).toPost();
        postRepository.save(posts);

        var result = postRepository.findById(posts.getId());

        assertThat(result, is(notNullValue()));
        assertEquals(posts, result.get());
        assertEquals(user, result.get().getUserId());
    }

}