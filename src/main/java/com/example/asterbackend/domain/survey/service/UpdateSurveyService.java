package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.facade.SurveyFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateSurveyService {

    private final SurveyFacade surveyFacade;

    public void updateSurvey(Long surveyId, CreateAndUpdateCommentRequest request) {
        Survey survey = surveyFacade.currentSurvey(surveyId);

        survey.updateSurvey(request.getContent());
    }

}
