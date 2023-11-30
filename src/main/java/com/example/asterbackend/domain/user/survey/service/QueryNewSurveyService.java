package com.example.asterbackend.domain.user.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import com.example.asterbackend.domain.admin.survey.repository.SurveyStorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryNewSurveyService {

    private final SurveyStorageRepository surveyStorageRepository;

    public List<SurveyStorage> queryNewSurvey() {
        List<SurveyStorage> surveyList = new ArrayList<>();

        surveyList.addAll(surveyStorageRepository.findEnumSurvey(SurveyType.SOCIAL_TYPE));
        surveyList.addAll(surveyStorageRepository.findEnumSurvey(SurveyType.KNOWLEDGE_TYPE));
        surveyList.addAll(surveyStorageRepository.findEnumSurvey(SurveyType.EMOTION_TYPE));
        surveyList.addAll(surveyStorageRepository.findEnumSurvey(SurveyType.DECISION_TYPE));

        Collections.shuffle(surveyList);

        return surveyList;
    }

}
