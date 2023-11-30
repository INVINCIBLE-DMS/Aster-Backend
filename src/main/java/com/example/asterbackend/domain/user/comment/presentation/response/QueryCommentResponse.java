package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCommentResponse {
    private Long id;

    private String content;

    private int commentLikeCount;

    private boolean isUpdated;

    private String username;

    private String profileImgUrl;

    public QueryCommentResponse(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.commentLikeCount = comment.getCommentLikeCount();
        this.isUpdated = comment.isUpdated();
        this.username = comment.getUser().getUsername();
        this.profileImgUrl = comment.getUser().getProfileImgUrl();
    }
}
