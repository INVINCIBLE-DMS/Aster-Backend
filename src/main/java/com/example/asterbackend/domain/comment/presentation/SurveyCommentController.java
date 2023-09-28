package com.example.asterbackend.domain.comment.presentation;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.presentation.response.SurveyCommentResponse;
import com.example.asterbackend.domain.comment.service.survey.CreateSurveyCommentService;
import com.example.asterbackend.domain.comment.service.survey.DeleteSurveyCommentService;
import com.example.asterbackend.domain.comment.service.survey.QuerySurveyCommentService;
import com.example.asterbackend.domain.comment.service.survey.UpdateSurveyCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey-comment")
public class SurveyCommentController {

    private final CreateSurveyCommentService createSurveyCommentService;

    private final QuerySurveyCommentService querySurveyCommentService;

    private final UpdateSurveyCommentService updateSurveyCommentService;

    private final DeleteSurveyCommentService deleteSurveyCommentService;

    @PostMapping("/{surveyId}")
    public void createSurveyComment(@PathVariable Long surveyId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        createSurveyCommentService.createSurveyComment(surveyId, request);
    }

    @GetMapping("/{surveyId}")
    public List<SurveyCommentResponse> querySurveyComment(@PathVariable Long surveyId) {
        return querySurveyCommentService.querySurveyComment(surveyId);
    }

    @PatchMapping("/{surveyCommentId}")
    public void updateSurveyComment(@PathVariable Long surveyCommentId, @RequestBody @Valid CreateAndUpdateCommentRequest request) {
        updateSurveyCommentService.updateSurveyComment(surveyCommentId, request);
    }

    @DeleteMapping("/{surveyCommentId}")
    public void deleteSurveyCommentService(@PathVariable Long surveyCommentId) {
        deleteSurveyCommentService.deleteSurveyComment(surveyCommentId);
    }

}