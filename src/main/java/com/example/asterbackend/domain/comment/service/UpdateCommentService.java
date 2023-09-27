package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import com.example.asterbackend.global.exception.comment.CommentNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {

    private final CommentRepository commentRepository;

    @Transactional
    public void updateComment(Long commentId, CreateAndUpdateCommentRequest request) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> CommentNotFoundException.EXCEPTION);

        comment.updateContent(request.getContent());
    }

}
