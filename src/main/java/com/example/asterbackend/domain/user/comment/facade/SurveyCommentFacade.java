package com.example.asterbackend.domain.user.comment.facade;

import com.example.asterbackend.domain.user.comment.entity.SurveyComment;
import com.example.asterbackend.domain.user.comment.repository.SurveyCommentRepository;
import com.example.asterbackend.global.exception.comment.CommentNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SurveyCommentFacade {

    private final SurveyCommentRepository surveyCommentRepository;

    public SurveyComment currentSurveyComment(Long surveyCommentId) {
        return surveyCommentRepository.findById(surveyCommentId)
                .orElseThrow(()-> CommentNotFoundException.EXCEPTION);
    }
}