package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.CoComment;
import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueryCoCommentResponse {
    private Long id;

    private String content;

    private String username;

    private String profileImgUrl;

    public QueryCoCommentResponse(CoComment cocomment) {
        this.id = cocomment.getId();
        this.content = cocomment.getContent();
        this.username = cocomment.getUser().getUsername();
        this.profileImgUrl = cocomment.getUser().getProfileImgUrl();
    }
}