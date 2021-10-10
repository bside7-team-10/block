package com.block.server.service;

import com.block.server.domain.HashTag;

public interface HashTagService {
    HashTag getOrCreateTag(String tagName);
}
