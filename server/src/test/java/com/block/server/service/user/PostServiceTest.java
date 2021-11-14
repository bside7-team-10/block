package com.block.server.service.user;

import com.block.server._generated.proto.postservice.*;
import com.block.server.domain.post.PostRepository;
import com.block.server.helper.TestPost;
import com.block.server.helper.TestUser;
import com.block.server.service.UserService;
import com.block.server.service.post.PostServiceImpl;
import com.block.server.service.postimagestorage.PostImageStorageService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;


@ExtendWith(MockitoExtension.class)
public class PostServiceTest {


    @Mock
    private PostRepository postRepository;

    @Mock
    private UserService userService;

    @Mock
    private PostImageStorageService postImageStorageService;

    @InjectMocks
    private PostServiceImpl postService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    @DisplayName("포스트 작성, response")
    public void CreatePost() {

        var testUser = TestUser.U1().toUser();
        ReflectionTestUtils.setField(testUser, "id", 1L);

        var testPost = TestPost.P1(testUser).toPost();
        ReflectionTestUtils.setField(testPost, "id", 1L);

        CreatePostRequest createPostRequest = CreatePostRequest.newBuilder()
                .setAuthor(testUser.getNickname())
                .setContent(testPost.getContent())
                .setLocation(
                        LocationDto.newBuilder()
                                .setLat(testPost.getLocation().getX())
                                .setLong(testPost.getLocation().getY())
                                .build())
                .build();

        doReturn(testPost)
                .when(postRepository)
                .save(any());

        doReturn("")
                .when(postImageStorageService)
                .getUploadUrl(any());

        doReturn(Optional.of(testPost.getUser()))
                .when(userService)
                .findByEmail(any());

        var createPost = postService.createPost(createPostRequest, testUser.getEmail());

        assertThat(createPost, Matchers.is(notNullValue()));
        assertEquals(PostProtocolStatus.SUCCESS, createPost.getStatus());
        log.debug("포스트 작성 {}: {}", testUser.getEmail(), createPost);
    }

    @Test
    @DisplayName("포스트를 가져온다")
    public void GetPost() {

        var testUser = TestUser.U1().toUser();
        ReflectionTestUtils.setField(testUser, "id", 1L);

        var testPost = TestPost.P1(testUser).toPost();
        ReflectionTestUtils.setField(testPost, "id", 1L);

        GetPostRequest getPostRequest = GetPostRequest.newBuilder()
                .setPostId(testUser.getId())
                .build();

        doReturn(Optional.ofNullable(testPost))
                .when(postRepository)
                .findById(any());

        doReturn("")
                .when(postImageStorageService)
                .getDownloadUrl(any());

        var getPost = postService.getPost(getPostRequest);

        assertThat(getPost, Matchers.is(notNullValue()));
        assertEquals(testPost.getUser().getNickname(), getPost.getPost().getAuthor().getNickname());
        assertEquals(testPost.getUser().getProfile(), getPost.getPost().getAuthor().getProfileUrl());
        assertEquals(testPost.getLikesCount(), 0);
        assertEquals(testPost.getCommentsCount(), 0);
        log.debug("포스트 목록 {}: {}", getPost.getPost(), getPost.getPost().getPostId());
    }

    @DisplayName("post를 가져온다.")
    @Test
    void GetPosts() {

        var testUser = TestUser.U1().toUser();
        ReflectionTestUtils.setField(testUser, "id", 1L);

        var testPostOne = TestPost.P1(testUser).toPost();
        ReflectionTestUtils.setField(testPostOne, "id", 1L);

        var testPostTwo = TestPost.P1(testUser).toPost();
        ReflectionTestUtils.setField(testPostTwo, "id", 2L);

        var testPostThree = TestPost.P1(testUser).toPost();
        ReflectionTestUtils.setField(testPostThree, "id", 3L);


        var list = new ArrayList<>();

        list.add(testPostOne);
        list.add(testPostTwo);
        list.add(testPostThree);

        GetPostsRequest getPostsRequest = GetPostsRequest.newBuilder()
                .setPageNumber(1)
                .setResultPerPage(2)
                .build();

        doReturn(list)
                .when(postRepository)
                .findWithPagination(any());

        doReturn("")
                .when(postImageStorageService)
                .getDownloadUrl(any());


        var posts = postService.getPosts(getPostsRequest);

        log.debug("포스트 목록 {}", posts);

    }
}




