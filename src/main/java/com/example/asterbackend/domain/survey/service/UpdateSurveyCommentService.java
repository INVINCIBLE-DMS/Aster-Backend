package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.survey.entity.SurveyComment;
import com.example.asterbackend.domain.survey.facade.SurveyCommentFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateSurveyCommentService {

    private final SurveyCommentFacade surveyCommentFacade;

    @Transactional
    public void updateSurveyComment(Long surveyCommentId, CreateAndUpdateCommentRequest request) {
        SurveyComment surveyComment = surveyCommentFacade.currentSurveyComment(surveyCommentId);

        surveyComment.updateContent(request.getContent());
    }

}