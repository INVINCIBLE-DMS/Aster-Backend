package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.type.AnswerType;
import com.example.asterbackend.domain.survey.entity.type.SurveyType;
import com.example.asterbackend.domain.survey.presentation.dto.request.AnswerSurveyRequest;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerSurveyService {

    private final UserFacade userFacade;

    public void answerSurvey(AnswerSurveyRequest request) {
        User user = userFacade.getCurrentUser();

        if(request.getSurveyType() == SurveyType.SOCIAL_TYPE) {
            if(request.getAnswerType() == AnswerType.NEUTRAL)user.addSocialTypeScore(0);
            else if(request.getAnswerType() == AnswerType.AGREE)user.addSocialTypeScore(5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_AGREE)user.addSocialTypeScore(10);
            else if(request.getAnswerType() == AnswerType.DISAGREE)user.addSocialTypeScore(-5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_DISAGREE)user.addSocialTypeScore(-10);
        }
        else if(request.getSurveyType() == SurveyType.KNOWLEDGE_TYPE) {
            if(request.getAnswerType() == AnswerType.NEUTRAL)user.addKnowledgeTypeScore(0);
            else if(request.getAnswerType() == AnswerType.AGREE)user.addKnowledgeTypeScore(5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_AGREE)user.addKnowledgeTypeScore(10);
            else if(request.getAnswerType() == AnswerType.DISAGREE)user.addKnowledgeTypeScore(-5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_DISAGREE)user.addKnowledgeTypeScore(-10);
        }
        else if(request.getSurveyType() == SurveyType.EMOTION_TYPE) {
            if(request.getAnswerType() == AnswerType.NEUTRAL)user.addEmotionTypeScore(0);
            else if(request.getAnswerType() == AnswerType.AGREE)user.addEmotionTypeScore(5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_AGREE)user.addEmotionTypeScore(10);
            else if(request.getAnswerType() == AnswerType.DISAGREE)user.addEmotionTypeScore(-5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_DISAGREE)user.addEmotionTypeScore(-10);
        }
        else if(request.getSurveyType() == SurveyType.DECISION_TYPE) {
            if(request.getAnswerType() == AnswerType.NEUTRAL)user.addDecisionTypeScore(0);
            else if(request.getAnswerType() == AnswerType.AGREE)user.addDecisionTypeScore(5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_AGREE)user.addDecisionTypeScore(10);
            else if(request.getAnswerType() == AnswerType.DISAGREE)user.addDecisionTypeScore(-5);
            else if(request.getAnswerType() == AnswerType.STRONGLY_DISAGREE)user.addDecisionTypeScore(-10);
        }
    }

}
