package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.admin.survey.repository.SurveyStorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveSurveyStorageService {

    private final SurveyStorageRepository surveyStorageRepository;

    public void saveSurveyStorage(SurveyRequest request) {
        surveyStorageRepository.save(
                SurveyStorage.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .build());
    }

}
