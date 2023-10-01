package com.example.asterbackend.domain.admin.comment.presentation;

import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.admin.comment.presentation.dto.SurveyCommentResponse;
import com.example.asterbackend.domain.admin.comment.service.surveyComment.CreateSurveyCommentService;
import com.example.asterbackend.domain.admin.comment.service.surveyComment.DeleteSurveyCommentService;
import com.example.asterbackend.domain.admin.comment.service.surveyComment.QuerySurveyCommentService;
import com.example.asterbackend.domain.admin.comment.service.surveyComment.UpdateSurveyCommentService;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
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
    public void createSurveyComment(@PathVariable Long surveyId, @RequestBody @Valid CommentRequest request) {
        createSurveyCommentService.createSurveyComment(surveyId, request);
    }

    @GetMapping("/{surveyId}")
    public List<SurveyCommentResponse> querySurveyComment(@PathVariable Long surveyId) {
        return querySurveyCommentService.querySurveyComment(surveyId);
    }

    @PatchMapping("/{surveyCommentId}")
    public void updateSurveyComment(@PathVariable Long surveyCommentId, @RequestBody @Valid SurveyRequest request) {
        updateSurveyCommentService.updateSurveyComment(surveyCommentId, request);
    }

    @DeleteMapping("/{surveyCommentId}")
    public void deleteSurveyCommentService(@PathVariable Long surveyCommentId) {
        deleteSurveyCommentService.deleteSurveyComment(surveyCommentId);
    }

}
