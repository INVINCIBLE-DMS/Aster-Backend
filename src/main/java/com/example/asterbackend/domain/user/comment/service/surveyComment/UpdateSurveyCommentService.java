package com.example.asterbackend.domain.user.comment.service.surveyComment;

import com.example.asterbackend.domain.user.comment.entity.SurveyComment;
import com.example.asterbackend.domain.user.comment.facade.SurveyCommentFacade;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateSurveyCommentService {

    private final SurveyCommentFacade surveyCommentFacade;

    @Transactional
    public void updateSurveyComment(Long surveyCommentId, SurveyRequest request) {
        SurveyComment surveyComment = surveyCommentFacade.currentSurveyComment(surveyCommentId);

        surveyComment.updateContent(request.getContent());
    }

}