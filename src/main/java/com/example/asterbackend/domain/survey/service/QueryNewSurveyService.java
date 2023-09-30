package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.repository.SurveyRepository;
import com.example.asterbackend.global.exception.survey.SurveyNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class QueryNewSurveyService {

   // private final Random random;

    private final SurveyRepository surveyRepository;

    public Survey queryNewSurvey(Long surveyId) {
        return surveyRepository.findById(surveyId)
                .orElseThrow(()-> SurveyNotFoundException.EXCEPTION);
    }

}
