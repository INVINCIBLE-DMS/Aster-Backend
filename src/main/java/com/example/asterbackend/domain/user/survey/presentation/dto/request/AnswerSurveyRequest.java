package com.example.asterbackend.domain.user.survey.presentation.dto.request;

import com.example.asterbackend.domain.user.survey.type.AnswerType;
import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnswerSurveyRequest {

    @NotNull
    private SurveyType surveyType;

    @NotNull
    private AnswerType answerType;

}
