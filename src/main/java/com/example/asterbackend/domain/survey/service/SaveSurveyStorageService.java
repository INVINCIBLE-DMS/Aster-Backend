package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.survey.repository.SurveyStorageRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveSurveyStorageService {

    private final SurveyStorageRepository surveyStorageRepository;
    private final UserFacade userFacade;

    public void saveSurveyStorage(SurveyRequest request) {

        User user = userFacade.getCurrentUser();

        surveyStorageRepository.save(
                SurveyStorage.builder()
                        .content(request.getContent())
                        .surveyType(request.getSurveyType())
                        .build()
        );
    }
}
