package com.example.asterbackend.domain.survey.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.survey.presentation.dto.request.CreateSurveyRequest;
import com.example.asterbackend.domain.survey.presentation.dto.response.SurveyListResponse;
import com.example.asterbackend.domain.survey.service.CreateSurveyService;
import com.example.asterbackend.domain.survey.service.QuerySurveyService;
import com.example.asterbackend.domain.survey.service.UpdateSurveyService;
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

    @PostMapping()
    public void createSurvey(@RequestBody @Valid CreateSurveyRequest request) {
        createSurveyService.createSurvey(request);
    }

    @GetMapping()
    public List<SurveyListResponse> querySurvey() {
        return querySurveyService.querySurvey();
    }

    @PatchMapping("/{surveyId}")
    public void updateSurvey(@PathVariable Long surveyId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        updateSurveyService.updateSurvey(surveyId, request);
    }

}