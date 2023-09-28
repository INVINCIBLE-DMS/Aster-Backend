package com.example.asterbackend.domain.survey.presentation;

import com.example.asterbackend.domain.survey.presentation.dto.request.CreateSurveyRequest;
import com.example.asterbackend.domain.survey.service.CreateSurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final CreateSurveyService createSurveyService;

    @PostMapping()
    public void createSurvey(@RequestBody @Valid CreateSurveyRequest request) {
        createSurveyService.createSurvey(request);
    }


}