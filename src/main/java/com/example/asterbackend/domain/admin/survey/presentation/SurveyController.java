package com.example.asterbackend.domain.admin.survey.presentation;

import com.example.asterbackend.domain.admin.survey.service.SaveSurveyStorageService;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.admin.survey.presentation.dto.SurveyListResponse;
import com.example.asterbackend.domain.admin.survey.service.CreateSurveyService;
import com.example.asterbackend.domain.admin.survey.service.DeleteSurveyService;
import com.example.asterbackend.domain.user.survey.service.QuerySurveyService;
import com.example.asterbackend.domain.admin.survey.service.UpdateSurveyService;
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

    private final UpdateSurveyService updateSurveyService;
    private final SaveSurveyStorageService saveSurveyStorageService;

    private final DeleteSurveyService deleteSurveyService;

    @PostMapping()
    public void createSurvey(@RequestBody @Valid SurveyRequest request) {
        createSurveyService.createSurvey(request);
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

    @PostMapping("/storage")
    public void saveSurveyStorage(@RequestBody @Valid SurveyRequest request) {
        saveSurveyStorageService.saveSurveyStorage(request);
    }

}