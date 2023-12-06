package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCommentResponse {

    private Long id;

    private String commentContent;

    private int commentLikeCount;

    private boolean commentIsUpdated;

    private String commentWriter;

    private String commentWriterProfile;

    private boolean isLiked;

    public QueryCommentResponse(Comment comment, boolean commentLiked) {
        this.id = comment.getId();
        this.commentContent = comment.getContent();
        this.commentLikeCount = comment.getCommentLikeCount();
        this.commentIsUpdated = comment.isUpdated();
        this.commentWriter = comment.getUser().getUsername();
        this.commentWriterProfile = comment.getUser().getProfileImgUrl();
        this.isLiked = isLiked();
    }
}
