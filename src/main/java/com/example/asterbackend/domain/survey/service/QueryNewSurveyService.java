package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.repository.SurveyStorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.asterbackend.domain.survey.entity.type.SurveyType.*;

@Service
@RequiredArgsConstructor
public class QueryNewSurveyService {

    private final SurveyStorageRepository surveyStorageRepository;

    public List<SurveyStorage> queryNewSurvey(Long surveyId) {
        List<SurveyStorage> surveyList = new ArrayList<>();

        surveyList.addAll(surveyStorageRepository.findEnumSurvey(SOCIAL_TYPE));
        surveyList.addAll(surveyStorageRepository.findEnumSurvey(KNOWLEDGE_TYPE));
        surveyList.addAll(surveyStorageRepository.findEnumSurvey(EMOTION_TYPE));
        surveyList.addAll(surveyStorageRepository.findEnumSurvey(DECISION_TYPE));

        return surveyList;
    }

}
