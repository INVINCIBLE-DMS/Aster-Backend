package com.example.asterbackend.domain.survey.facade;

import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.repository.SurveyRepository;
import com.example.asterbackend.global.exception.survey.SurveyNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SurveyFacade {

    private final SurveyRepository surveyRepository;

    public Survey currentSurvey(Long surveyId) {
        return surveyRepository.findById(surveyId)
                .orElseThrow(()-> SurveyNotFoundException.EXCEPTION);
    }
}
