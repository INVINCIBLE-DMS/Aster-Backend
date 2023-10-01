package com.example.asterbackend.domain.user.comment.facade;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.repository.CommentRepository;
import com.example.asterbackend.global.exception.comment.CommentNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommentFacade {

    private final CommentRepository commentRepository;

    public Comment currentComment(Long commentId) {
        return commentRepository.findById(commentId)
                .orElseThrow(()-> CommentNotFoundException.EXCEPTION);
    }

}
