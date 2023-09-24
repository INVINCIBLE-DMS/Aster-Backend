package com.example.asterbackend.domain.feed.presentation.dto.response;

import com.example.asterbackend.domain.feed.entity.Feed;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FeedListResponse {

    private String content;

    private LocalDateTime createAt;

    private int likeCount;

    public FeedListResponse(Feed feed) {
        this.content = feed.getContent();
        this.createAt = feed.getCreateAt();
        this.likeCount = feed.getLikeCount();
    }

}
