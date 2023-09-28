package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.Agree;
import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.facade.SurveyFacade;
import com.example.asterbackend.domain.survey.repository.AgreeRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddAgreeService {

    private final UserFacade userFacade;
    private final SurveyFacade surveyFacade;
    private final AgreeRepository agreeRepository;

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

    }
}
