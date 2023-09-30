package com.example.asterbackend.domain.comment.service.comment;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.facade.CommentFacade;
import com.example.asterbackend.domain.comment.presentation.request.CommentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {

    private final CommentFacade commentFacade;

    @Transactional
    public void updateComment(Long commentId, CommentRequest request) {
        Comment comment = commentFacade.currentComment(commentId);

        comment.updateContent(request.getContent());
    }

}