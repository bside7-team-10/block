package com.block.server.service;

import com.block.server.domain.hashtag.HashTag;

public interface HashTagService {
    HashTag getOrCreateTag(String tagName);
}
