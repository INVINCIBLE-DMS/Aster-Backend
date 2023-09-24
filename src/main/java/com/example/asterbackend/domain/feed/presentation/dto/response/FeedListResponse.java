package com.example.asterbackend.domain.feed.presentation.dto.response;

import com.example.asterbackend.domain.feed.entity.Feed;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FeedListResponse {

    private String content;

    private LocalDateTime writeTime;

    private int likeCount;

    public FeedListResponse(Feed Feed) {
        this.content = Feed.getContent();
        this.writeTime = Feed.getWriteTime();
        this.likeCount = Feed.getLikeCount();
    }

}
