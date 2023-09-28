package com.example.asterbackend.domain.survey.presentation.dto.response;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.survey.entity.SurveyComment;
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
