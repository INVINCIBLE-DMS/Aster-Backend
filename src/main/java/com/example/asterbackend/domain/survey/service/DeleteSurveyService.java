package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSurveyService {

    private final SurveyRepository surveyRepository;

    public void deleteSurvey(Long surveyId) {
        surveyRepository.deleteById(surveyId);
    }

}
