package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.survey.repository.SurveyRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateSurveyService {

    private final SurveyRepository surveyRepository;
    private final UserFacade userFacade;

    public void createSurvey(SurveyRequest request) {

        User user = userFacade.getCurrentUser();

        surveyRepository.save(
                Survey.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .nickname(user.getNickname())
                        .build());

    }
}
