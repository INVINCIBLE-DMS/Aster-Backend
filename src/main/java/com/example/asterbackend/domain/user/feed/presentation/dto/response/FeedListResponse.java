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

    private String title;

    private String content;

    private String feedImgUrl;

    private LocalDateTime createdAt;

    private int likeCount;

    private String username;

    private String profileImgUrl;

    public FeedListResponse(Feed feed) {
        this.id = feed.getId();
        this.title = feed.getTitle();
        this.content = feed.getContent();
        this.feedImgUrl = feed.getFeedImgUrl();
        this.createdAt = feed.getCreatedAt();
        this.likeCount = feed.getLikeCount();
        this.username = feed.getUser().getUsername();
        this.feedImgUrl = feed.getUser().getProfileImgUrl();
    }

}
