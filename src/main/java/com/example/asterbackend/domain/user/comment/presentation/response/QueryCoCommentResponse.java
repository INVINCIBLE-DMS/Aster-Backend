package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.CoComment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCoCommentResponse {
    private Long id;

    private String content;

    public QueryCoCommentResponse(CoComment cocomment) {
        this.id = cocomment.getId();
        this.content = cocomment.getContent();
    }
}