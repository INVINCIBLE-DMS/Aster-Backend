package com.example.asterbackend.domain.user.feed.presentation.dto.response;

import com.example.asterbackend.domain.user.feed.entity.Feed;
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

    private boolean isLiked;

    private int commentCount;

    public FeedListResponse(Feed feed, boolean isLiked) {
        this.id = feed.getId();
        this.title = feed.getTitle();
        this.content = feed.getContent();
        this.feedImgUrl = feed.getFeedImgUrl();
        this.createdAt = feed.getCreatedAt();
        this.likeCount = feed.getLikeCount();
        this.username = feed.getUser().getUsername();
        this.profileImgUrl = feed.getUser().getProfileImgUrl();
        this.isLiked = isLiked;
        this.commentCount = feed.getComment().size();
    }

}
