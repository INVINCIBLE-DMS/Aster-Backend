package com.example.asterbackend.domain.user.comment.service.comment;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.facade.CommentFacade;
import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.global.exception.user.NotAdminException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {

    private final CommentFacade commentFacade;

    private final UserFacade userFacade;

    @Transactional
    public void updateComment(Long commentId, CommentRequest request) {
        Comment comment = commentFacade.currentComment(commentId);

        if(!(userFacade.getCurrentUser() == comment.getUser()))throw NotAdminException.EXCEPTION;

        comment.updateContent(request.getContent());
    }

}
