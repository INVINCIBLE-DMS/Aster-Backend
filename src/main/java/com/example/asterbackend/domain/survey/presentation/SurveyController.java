package com.example.asterbackend.domain.survey.presentation;

import com.example.asterbackend.domain.survey.presentation.dto.request.CreateSurveyRequest;
import com.example.asterbackend.domain.survey.presentation.dto.response.SurveyListResponse;
import com.example.asterbackend.domain.survey.service.CreateSurveyService;
import com.example.asterbackend.domain.survey.service.QuerySurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final CreateSurveyService createSurveyService;

    private final QuerySurveyService querySurveyService;

    @PostMapping()
    public void createSurvey(@RequestBody @Valid CreateSurveyRequest request) {
        createSurveyService.createSurvey(request);
    }

    @GetMapping()
    public List<SurveyListResponse> querySurvey() {
        return querySurveyService.querySurvey();
    }


}