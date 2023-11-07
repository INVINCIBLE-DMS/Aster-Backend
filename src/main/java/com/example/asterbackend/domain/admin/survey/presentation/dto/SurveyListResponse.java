package com.example.asterbackend.domain.admin.survey.presentation.dto;

import com.example.asterbackend.domain.admin.survey.entity.Survey;
import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SurveyListResponse {

    private Long id;

    private String content;

    private String studentId;

    private String surveyImgUrl;

    private SurveyType surveyType;

    private int agreeCnt;

    public SurveyListResponse(Survey survey) {
        this.id = survey.getId();
        this.content = survey.getContent();
        this.studentId = survey.getStudentId();
        this.surveyImgUrl = survey.getSurveyImgUrl();
        this.surveyType = survey.getSurveyType();
        this.agreeCnt = survey.getAgreeCnt();
    }

}
