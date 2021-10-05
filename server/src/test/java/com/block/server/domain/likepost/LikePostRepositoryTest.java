package com.block.server.domain.likepost;

import com.block.server.domain.posts.PostRepository;
import com.block.server.domain.user.UserRepository;
import com.block.server.helper.TestLikePost;
import com.block.server.helper.TestPosts;
import com.block.server.helper.TestUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


@DataJpaTest
public class LikePostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LikePostRepository likePostRepository;

    @Test
    @DisplayName("post를 좋아요한다.")
    public void likePost() {
        var user = TestUser.U1().toUser();
        userRepository.save(user);

        var posts = TestPosts.U1(user).toPost();
        postRepository.save(posts);

        var likePost =  likePostRepository.save(TestLikePost.U1(user,posts).toComment());


        assertThat(likePost, is(notNullValue()));
    }
}
