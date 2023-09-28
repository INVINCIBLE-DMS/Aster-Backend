package com.example.asterbackend.domain.survey.presentation.dto.response;

import com.example.asterbackend.domain.survey.entity.Survey;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SurveyListResponse {

    private String content;

    private int agreeCnt;

    public SurveyListResponse(Survey survey) {
        this.content = survey.getContent();
        this.agreeCnt = survey.getAgreeCnt();
    }
}
