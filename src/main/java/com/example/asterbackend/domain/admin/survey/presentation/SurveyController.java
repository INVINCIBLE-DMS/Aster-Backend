package com.example.asterbackend.domain.admin.survey.presentation;

import com.example.asterbackend.domain.admin.survey.service.SaveSurveyStorageService;
import com.example.asterbackend.domain.user.feed.presentation.dto.request.FeedRequest;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.admin.survey.presentation.dto.SurveyListResponse;
import com.example.asterbackend.domain.admin.survey.service.CreateSurveyService;
import com.example.asterbackend.domain.admin.survey.service.DeleteSurveyService;
import com.example.asterbackend.domain.user.survey.service.QuerySurveyService;
import com.example.asterbackend.domain.admin.survey.service.UpdateSurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    public void createSurvey(@RequestPart("content") SurveyRequest request,
                             @RequestPart(value = "image", required = false) MultipartFile surveyImage) {
        createSurveyService.createSurvey(request, surveyImage);
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
    public void saveSurveyStorage(@RequestPart("content") SurveyRequest request,
                                  @RequestPart(value = "image", required = false) MultipartFile surveyImage) {
        saveSurveyStorageService.saveSurveyStorage(request, surveyImage);
    }

}