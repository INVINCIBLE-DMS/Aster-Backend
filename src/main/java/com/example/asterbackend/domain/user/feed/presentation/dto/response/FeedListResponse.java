package com.example.asterbackend.domain.user.feed.presentation.dto.response;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FeedListResponse {

    private Long id;

    private String content;

    private String feedImgUrl;

    private User user;

    private LocalDateTime createdAt;

    private int likeCount;

    public FeedListResponse(Feed feed) {
        this.id = feed.getId();
        this.content = feed.getContent();
        this.feedImgUrl = feed.getFeedImgUrl();
        this.user = feed.getUser();
        this.createdAt = feed.getCreatedAt();
        this.likeCount = feed.getLikeCount();
    }

}
