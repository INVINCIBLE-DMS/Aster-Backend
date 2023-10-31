package com.example.asterbackend.domain.user.survey.presentation.dto.request;

import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SurveyRequest {

    @NotNull
    private String content;

    @NotNull
    private SurveyType surveyType;

    private String surveyImgUrl;

}
