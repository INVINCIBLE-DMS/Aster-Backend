package com.example.asterbackend.domain.auth.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

@Getter
@Builder
@RedisHash(timeToLive = 60 * 24 * 7 * 52)
public class RefreshToken {

    @Id
    private String userId;

    @Indexed
    private String token;

    @TimeToLive
    private Long timeToLive;
}
