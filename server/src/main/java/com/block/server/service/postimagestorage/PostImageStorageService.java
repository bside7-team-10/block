package com.block.server.service.postimagestorage;

public interface PostImageStorageService {
    String getImageKeyForPostId(Long postId);
    String getUploadUrl(String key);
    String getDownloadUrl(String key);
}
