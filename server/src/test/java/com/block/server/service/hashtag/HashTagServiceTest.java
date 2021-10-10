package com.block.server.service.hashtag;

import com.block.server.domain.HashTag;
import com.block.server.domain.repository.HashTagRepository;
import com.block.server.service.HashTagServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.client.ExpectedCount.times;

@ExtendWith(MockitoExtension.class)
public class HashTagServiceTest {

    @Mock
    private HashTagRepository hashTagRepository;

    @InjectMocks
    private HashTagServiceImpl hashTagService;

    @Test
    @DisplayName("getOrCreate 시 새 태그를 repo에 저장해야함")
    public void getOrCreate_should_create_new_tag() throws Exception {

        var expectedName = "newTagResult";
        var newHashTag = HashTag.builder()
                .tagName(expectedName)
                .build();

        doReturn(newHashTag)
                .when(hashTagRepository)
                .save(any());
        doReturn(Optional.empty())
                .when(hashTagRepository)
                .findByTagName(any());

        var newTag = hashTagService.getOrCreateTag(expectedName);

        ArgumentCaptor<HashTag> hashTagArgumentCaptor = ArgumentCaptor.forClass(HashTag.class);
        verify(hashTagRepository).save(hashTagArgumentCaptor.capture());

        assertEquals(expectedName, hashTagArgumentCaptor.getValue().getTagName());
    }

    @Test
    @DisplayName("getOrCreate 시 존재하는 tag를 return 해야 함")
    public void getOrCreate_should_return_existing_tag() throws Exception {

        var expectedName = "newTagResult";
        var newHashTag = HashTag.builder()
                .tagName(expectedName)
                .build();

        doReturn(Optional.ofNullable(newHashTag))
                .when(hashTagRepository)
                .findByTagName(any());

        var newTag = hashTagService.getOrCreateTag(expectedName);

        verify(hashTagRepository, never()).save(any());
    }
}
