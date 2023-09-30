package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.facade.SurveyFacade;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateSurveyService {

    private final SurveyFacade surveyFacade;

    public void updateSurvey(Long surveyId, SurveyRequest request) {
        Survey survey = surveyFacade.currentSurvey(surveyId);

        survey.updateSurvey(request.getContent(), request.getSurveyType());
    }

}
