package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.repository.SurveyStorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryNewSurveyService {

   // private final Random random;

    private final SurveyStorageRepository surveyStorageRepository;

    public SurveyStorage queryNewSurvey(Long surveyId) {
        return surveyStorageRepository.findById(surveyId)
                .orElseThrow();
    }

}
