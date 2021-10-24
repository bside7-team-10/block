package com.block.server.service.user;

import com.block.server._generated.proto.postservice.CreatePostRequest;
import com.block.server._generated.proto.postservice.Location;
import com.block.server.domain.post.PostRepository;
import com.block.server.domain.user.UserRepository;
import com.block.server.helper.TestPost;
import com.block.server.helper.TestUser;
import com.block.server.service.post.PostServiceImpl;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class PostServiceTest {

     @Mock
     private UserRepository userRepository;

     @Mock
     private PostRepository postRepository;

     @InjectMocks
     private PostServiceImpl postService;

     private final Logger log = LoggerFactory.getLogger(getClass());


     @Test
     @DisplayName("포스트 작성 후 성공 response")
     public void CreatePost() {


         postService = new PostServiceImpl(userRepository,postRepository);
         var testUser = TestUser.U1().toUser();
         var testPost = TestPost.P1(testUser).toPost();

         doReturn(testUser).when(this.userRepository).save(testUser);


         CreatePostRequest createPostRequest = CreatePostRequest.newBuilder()
                 .setAuthor(testUser.getNickName())
                 .setContent(testPost.getContent())
                 .setLocation(
                            Location.newBuilder()
                            .setLat(testPost.getLocation().getX())
                            .setLong(testPost.getLocation().getY())
                            .build())
                 .build();


//         var createPost=  postService.create(createPostRequest);
//
//         assertThat(createPost, is(notNullValue()));
//         log.info("사용자 이메일 조회 {}: {}", testUser.getEmail(), createPost);
     }


 }
