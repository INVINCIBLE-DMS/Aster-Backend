package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.Survey;
import com.example.asterbackend.domain.admin.user.entity.Admin;
import com.example.asterbackend.domain.admin.user.facade.AdminFacade;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.admin.survey.repository.SurveyRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateSurveyService {

    private final SurveyRepository surveyRepository;
    private final AdminFacade adminFacade;

    public void createSurvey(SurveyRequest request) {

        Admin admin = adminFacade.getCurrentAdmin();

        surveyRepository.save(
                Survey.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .nickname(admin.getUsername())
                        .build());

    }

}
