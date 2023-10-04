package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.admin.survey.repository.SurveyStorageRepository;
import com.example.asterbackend.infra.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class SaveSurveyStorageService {

    private final SurveyStorageRepository surveyStorageRepository;
    private final S3Util s3Util;

    public void saveImageSurveyStorage(SurveyRequest request, MultipartFile surveyImage) {

        String surveyImageUrl = s3Util.upload(surveyImage);

        surveyStorageRepository.save(
                SurveyStorage.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .surveyImageUrl(surveyImageUrl)
                        .build());
    }

    public void saveSurveyStorage(SurveyRequest request) {

        surveyStorageRepository.save(
                SurveyStorage.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .build());
    }

}
