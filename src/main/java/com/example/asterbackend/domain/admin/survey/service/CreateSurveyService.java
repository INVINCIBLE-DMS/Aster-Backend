package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.Survey;
import com.example.asterbackend.domain.admin.survey.repository.SurveyRepository;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.infra.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class CreateSurveyService {

    private final SurveyRepository surveyRepository;
    private final UserFacade userFacade;
    private final S3Util s3Util;

    public void createImageSurvey(SurveyRequest request, MultipartFile surveyImage) {

        User user = userFacade.getCurrentUser();

        String surveyImageUrl = s3Util.uploadImage(surveyImage);

        surveyRepository.save(
                Survey.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .surveyImageUrl(surveyImageUrl)
                        .nickname(user.getNickname())
                        .build());

    }

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
