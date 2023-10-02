package com.example.asterbackend.domain.user.feed.presentation.dto.response;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FeedListResponse {

    private Long id;

    private String content;

    private String feedImage;

    private LocalDateTime createAt;

    private int likeCount;

    public FeedListResponse(Feed feed) {
        this.id = feed.getId();
        this.content = feed.getContent();
        this.feedImage = feed.getFeedImageUrl();
        this.createAt = feed.getCreateAt();
        this.likeCount = feed.getLikeCount();
    }

}
