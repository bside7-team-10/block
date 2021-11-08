package com.block.server.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
@ConfigurationProperties(prefix = "server.info")
public class ServerInfoConfig {
    private PostImageConfig postimage;

    @Getter
    public class PostImageConfig {
        private String bucketname;
    }
}
