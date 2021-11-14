package com.block.server.service.postimagestorage;

import com.amazonaws.HttpMethod;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.block.server.config.ServerInfoConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostImageStorageServiceImpl implements PostImageStorageService {

    private final ServerInfoConfig serverInfoConfig;

    private final AmazonS3Client amazonS3Client;

    public String getImageKeyForPostId(Long postId) {
        var sb = new StringBuilder();
        sb.append("image-")
            .append(postId)
            .append("-")
            .append(1);
        return sb.toString();
    }

    private Date calculateExpiration() {
        Date expiration = new Date();
        long expTimeMillis = expiration.getTime();
        expTimeMillis += 1000 * 60;
        expiration.setTime(expTimeMillis);

        return expiration;
    }

    public String getUploadUrl(String key) {
        try {
            var request = new GeneratePresignedUrlRequest(serverInfoConfig.getPostimagebucket(), key)
                    .withMethod(HttpMethod.PUT)
                    .withExpiration(calculateExpiration());
            var url = amazonS3Client.generatePresignedUrl(request);

            return url.toExternalForm();
        } catch (Exception ex) {
            log.error("Failed to get upload presigned url for key " + key + ", " + ex.toString());
            return "";
        }
    }

    public String getDownloadUrl(String key) {
        try {
            var request = new GeneratePresignedUrlRequest(serverInfoConfig.getPostimagebucket(), key)
                    .withMethod(HttpMethod.GET)
                    .withExpiration(calculateExpiration());
            var url = amazonS3Client.generatePresignedUrl(request);

            return url.toExternalForm();
        } catch (Exception ex) {
            log.error("Failed to get upload presigned url for key " + key + ", " + ex.toString());
            return "";
        }
    }
}
