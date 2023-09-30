package com.example.asterbackend.domain.comment.presentation.response;

import com.example.asterbackend.domain.comment.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCommentResponse {
    private Long id;

    private String content;

    private boolean isUpdate;

    public QueryCommentResponse(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.isUpdate = comment.isUpdate();
    }
}
