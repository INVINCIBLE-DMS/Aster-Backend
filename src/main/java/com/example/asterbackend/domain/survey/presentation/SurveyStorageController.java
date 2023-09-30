package com.example.asterbackend.domain.survey.presentation;

import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.survey.service.SaveSurveyStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey-storage")
public class SurveyStorageController {

    private final SaveSurveyStorageService saveSurveyStorageService;

    @PostMapping()
    public void saveSurveyStorage(@RequestBody @Valid SurveyRequest request) {
        saveSurveyStorageService.saveSurveyStorage(request);
    }
}
