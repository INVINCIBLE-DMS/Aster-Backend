package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.repository.CoCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCoCommentService {
    private final CoCommentRepository coCommentRepository;

    public void deleteCoComment(Long coCommentId) {
        coCommentRepository.deleteById(coCommentId);
    }
}
