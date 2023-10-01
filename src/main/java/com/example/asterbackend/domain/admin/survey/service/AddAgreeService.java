package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.user.survey.entity.Agree;
import com.example.asterbackend.domain.admin.survey.entity.Survey;
import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.admin.survey.facade.SurveyFacade;
import com.example.asterbackend.domain.admin.survey.repository.AgreeRepository;
import com.example.asterbackend.domain.admin.survey.repository.SurveyStorageRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddAgreeService {

    private final UserFacade userFacade;
    private final SurveyFacade surveyFacade;
    private final AgreeRepository agreeRepository;
    private final SurveyStorageRepository surveyStorageRepository;

    @Transactional
    public void addAgree(Long surveyId){
        Survey survey = surveyFacade.currentSurvey(surveyId);

        User user = userFacade.getCurrentUser();

        if (agreeRepository.existsBySurveyIdAndNickname(surveyId, user.getNickname())) {
            survey.cancelAgree();

            agreeRepository.deleteBySurveyIdAndNickname(surveyId, user.getNickname());

        }
        else {
            survey.addAgree();

            agreeRepository.save(
                    Agree.builder()
                            .nickname(user.getNickname())
                            .survey(survey)
                            .build());
        }
        if(survey.getAgreeCnt()>=5) {
            surveyStorageRepository.save(
                    SurveyStorage.builder()
                            .content(survey.getContent())
                            .surveyType(survey.getSurveyType())
                            .build());
        }
    }
}