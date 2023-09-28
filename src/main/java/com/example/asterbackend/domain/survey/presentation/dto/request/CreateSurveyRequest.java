package com.example.asterbackend.domain.survey.presentation.dto.request;

import com.example.asterbackend.domain.survey.entity.type.SurveyType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateSurveyRequest {

    private String content;

    private SurveyType surveyType;
}
