package com.example.asterbackend.domain.comment.service.comment;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.facade.CommentFacade;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {

    private final CommentFacade commentFacade;

    @Transactional
    public void updateComment(Long commentId, SurveyRequest request) {
        Comment comment = commentFacade.currentComment(commentId);

        comment.updateContent(request.getContent());
    }

}
