package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.Agree;
import com.example.asterbackend.domain.admin.survey.entity.Survey;
import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.admin.survey.facade.SurveyFacade;
import com.example.asterbackend.domain.admin.survey.repository.AgreeRepository;
import com.example.asterbackend.domain.admin.survey.repository.SurveyRepository;
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

    private final SurveyRepository surveyRepository;

    @Transactional
    public void addAgree(Long surveyId){
        Survey survey = surveyFacade.currentSurvey(surveyId);

        User user = userFacade.getCurrentUser();

        if (agreeRepository.existsBySurveyIdAndStudentId(surveyId, user.getStudentId())) {
            survey.cancelAgree();

            agreeRepository.deleteBySurveyIdAndStudentId(surveyId, user.getStudentId());

        }
        else {
            survey.addAgree();

            agreeRepository.save(
                    Agree.builder()
                            .username(user.getUsername())
                            .survey(survey)
                            .build());
        }
        if(survey.getAgreeCnt()>=5) {
            surveyStorageRepository.save(
                    SurveyStorage.builder()
                            .content(survey.getContent())
                            .surveyType(survey.getSurveyType())
                            .build());

            surveyRepository.delete(survey);
        }
    }
}
