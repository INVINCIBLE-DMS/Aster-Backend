package com.example.asterbackend.domain.survey.presentation;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.survey.presentation.dto.response.SurveyListResponse;
import com.example.asterbackend.domain.survey.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

    private final CreateSurveyService createSurveyService;

    private final QueryNewSurveyService queryNewSurveyService;

    private final QuerySurveyService querySurveyService;

    private final UpdateSurveyService updateSurveyService;

    private final DeleteSurveyService deleteSurveyService;

    @PostMapping()
    public void createSurvey(@RequestBody @Valid SurveyRequest request) {
        createSurveyService.createSurvey(request);
    }

    @GetMapping("/new")
    public List<SurveyStorage> queryNewSurvey() {
        return queryNewSurveyService.queryNewSurvey();
    }

    @GetMapping()
    public List<SurveyListResponse> querySurvey() {
        return querySurveyService.querySurvey();
    }

    @PatchMapping("/{surveyId}")
    public void updateSurvey(@PathVariable Long surveyId, @RequestBody @Valid SurveyRequest request) {
        updateSurveyService.updateSurvey(surveyId, request);
    }

    @DeleteMapping("/{surveyId}")
    public void deleteSurvey(@PathVariable Long surveyId) {
        deleteSurveyService.deleteSurvey(surveyId);
    }

}