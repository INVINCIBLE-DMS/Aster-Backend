package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class QueryCommentResponse {

    private Long feedId;

    private String feedContent;

    private String feedImgUrl;

    private LocalDateTime createdAt;

    private int feedLikeCount;

    private String feedWriter;

    private String feedWriterProfile;

    private Long commentId;

    private String commentContent;

    private int commentLikeCount;

    private boolean commentIsUpdated;

    private String commentWriter;

    private String commentWriterProfile;

    public QueryCommentResponse(Comment comment) {
        this.feedId  = comment.getFeed().getId();
        this.feedContent = comment.getFeed().getContent();
        this.feedImgUrl = comment.getFeed().getFeedImgUrl();
        this.createdAt = comment.getFeed().getCreatedAt();
        this.feedLikeCount = comment.getFeed().getLikeCount();
        this.feedWriter = comment.getFeed().getUser().getUsername();
        this.feedWriterProfile = comment.getFeed().getUser().getProfileImgUrl();
        this.commentId = comment.getId();
        this.commentContent = comment.getContent();
        this.commentLikeCount = comment.getCommentLikeCount();
        this.commentIsUpdated = comment.isUpdated();
        this.commentWriter = comment.getUser().getUsername();
        this.commentWriterProfile = comment.getUser().getProfileImgUrl();

    }
}
