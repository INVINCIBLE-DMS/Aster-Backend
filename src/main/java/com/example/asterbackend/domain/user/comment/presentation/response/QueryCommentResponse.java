package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCommentResponse {
    private Long id;

    private String content;

    private boolean isUpdated;

    public QueryCommentResponse(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.isUpdated = comment.isUpdated();
    }
}
