package com.example.asterbackend.domain.comment.presentation.response;

import com.example.asterbackend.domain.comment.entity.SurveyComment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SurveyCommentResponse {
    private Long id;

    private String content;

    public SurveyCommentResponse(SurveyComment surveyComment) {
        this.id = surveyComment.getId();
        this.content = surveyComment.getContent();
    }
}
