package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import com.example.asterbackend.global.exception.comment.CommentNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {

    private final CommentRepository commentRepository;

    public void deleteComment(Long commentId) {
        Comment comment = commentRepository.findById(commentId)
                        .orElseThrow(()-> CommentNotFoundException.EXCEPTION);

        comment.getFeed().deleteComment(comment);

        commentRepository.deleteById(commentId);
    }

}
