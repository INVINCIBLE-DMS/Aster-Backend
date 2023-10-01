package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.comment.entity.SurveyComment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SurveyCommentResponse {
    private Long id;

    private String content;

    private boolean isUpdate;

    public SurveyCommentResponse(SurveyComment surveyComment) {
        this.id = surveyComment.getId();
        this.content = surveyComment.getContent();
        this.isUpdate = surveyComment.isUpdate();
    }
}
