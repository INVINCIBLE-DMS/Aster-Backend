package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCommentResponse {
    private Long id;

    private User user;

    private String content;

    private boolean isUpdated;

    public QueryCommentResponse(Comment comment) {
        this.id = comment.getId();
        this.user = comment.getUser();
        this.content = comment.getContent();
        this.isUpdated = comment.isUpdated();
    }
}
