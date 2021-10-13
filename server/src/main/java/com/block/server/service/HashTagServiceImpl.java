package com.block.server.service;

import com.block.server.domain.hashtag.HashTag;
import com.block.server.domain.hashtag.HashTagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HashTagServiceImpl implements HashTagService {

    private final HashTagRepository hashTagRepository;

    public HashTag getOrCreateTag(String tagName) {
        var tag = hashTagRepository.findByTagName(tagName);
        if (tag.isPresent()) {
            return tag.get();
        }

        var newTag = HashTag.builder()
                .tagName(tagName)
                .build();
        hashTagRepository.save(newTag);

        return newTag;
    }
}
