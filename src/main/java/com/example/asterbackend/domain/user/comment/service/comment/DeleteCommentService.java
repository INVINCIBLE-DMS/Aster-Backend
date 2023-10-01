package com.example.asterbackend.domain.user.comment.service.comment;

import com.example.asterbackend.domain.user.comment.repository.CommentRepository;
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
