package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {

    private final CommentRepository commentRepository;

    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }

}
