package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.entity.type.SurveyType;
import com.example.asterbackend.domain.survey.repository.SurveyStorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.asterbackend.domain.survey.entity.type.SurveyType.*;

@Service
@RequiredArgsConstructor
public class QueryNewSurveyService {

    private final SurveyStorageRepository surveyStorageRepository;

    public List<SurveyStorage> queryNewSurvey() {
        List<SurveyStorage> surveyList = new ArrayList<>();

        SurveyStorage randomSocialSurvey = getRandomSurvey(SurveyType.SOCIAL_TYPE);
        SurveyStorage randomKnowledgeSurvey = getRandomSurvey(SurveyType.KNOWLEDGE_TYPE);
        SurveyStorage randomEmotionSurvey = getRandomSurvey(SurveyType.EMOTION_TYPE);
        SurveyStorage randomDecisionSurvey = getRandomSurvey(SurveyType.DECISION_TYPE);

        surveyList.add(randomSocialSurvey);
        surveyList.add(randomKnowledgeSurvey);
        surveyList.add(randomEmotionSurvey);
        surveyList.add(randomDecisionSurvey);

        return surveyList;
    }

    private SurveyStorage getRandomSurvey(SurveyType surveyType) {
        // 해당 타입의 모든 설문조사를 조회
        List<SurveyStorage> surveysOfType = surveyStorageRepository.findEnumSurvey(surveyType);

        // 랜덤하게 선택
        Random random = new Random();
        int randomIndex = random.nextInt(surveysOfType.size());
        return surveysOfType.get(randomIndex);
    }

}
