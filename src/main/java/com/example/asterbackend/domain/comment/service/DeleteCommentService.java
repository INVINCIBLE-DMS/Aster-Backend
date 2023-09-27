package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.facade.CommentFacade;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {

    private final CommentRepository commentRepository;

    private final CommentFacade commentFacade;

    public void deleteComment(Long commentId) {
        Comment comment = commentFacade.currentComment(commentId);

        comment.getFeed().deleteComment(comment);

        commentRepository.deleteById(commentId);
    }

}
