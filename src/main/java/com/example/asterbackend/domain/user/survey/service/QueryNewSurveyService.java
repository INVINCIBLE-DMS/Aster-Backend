package com.example.asterbackend.domain.user.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import com.example.asterbackend.domain.admin.survey.repository.SurveyStorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class QueryNewSurveyService {

    private final SurveyStorageRepository surveyStorageRepository;

    public List<SurveyStorage> queryNewSurvey() {
        List<SurveyStorage> surveyList = new ArrayList<>();

        List<SurveyStorage> randomSocialSurvey = getRandomSurvey(SurveyType.SOCIAL_TYPE);
        List<SurveyStorage> randomKnowledgeSurvey = getRandomSurvey(SurveyType.KNOWLEDGE_TYPE);
        List<SurveyStorage> randomEmotionSurvey = getRandomSurvey(SurveyType.EMOTION_TYPE);
        List<SurveyStorage> randomDecisionSurvey = getRandomSurvey(SurveyType.DECISION_TYPE);

        surveyList.addAll(randomSocialSurvey);
        surveyList.addAll(randomKnowledgeSurvey);
        surveyList.addAll(randomEmotionSurvey);
        surveyList.addAll(randomDecisionSurvey);

        return surveyList;
    }

    private List<SurveyStorage> getRandomSurvey(SurveyType surveyType) {
        // 해당 타입의 모든 설문을 조회
        List<SurveyStorage> surveysOfType = surveyStorageRepository.findEnumSurvey(surveyType);
        List<SurveyStorage> randomSurveys = new ArrayList<>();

        // 랜덤으로 설문 4개 반환
        Random random = new Random();
        for(int i=0;i<4;i++) {
            SurveyStorage randomSurvey = surveysOfType.get(random.nextInt());
            if(randomSurveys.contains(randomSurvey))continue;;
            randomSurveys.add(randomSurvey);
        }

        return randomSurveys;
    }

}
