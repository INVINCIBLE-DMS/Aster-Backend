package com.example.asterbackend.domain.user.comment.service.cocomment;

import com.example.asterbackend.domain.user.comment.repository.CoCommentRepository;
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
