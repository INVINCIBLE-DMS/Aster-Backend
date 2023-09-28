package com.example.asterbackend.domain.comment.service.cocomment;

import com.example.asterbackend.domain.comment.presentation.response.QueryCoCommentResponse;
import com.example.asterbackend.domain.comment.repository.CoCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryCoCommentService {

    private final CoCommentRepository coCommentRepository;

    public List<QueryCoCommentResponse> queryCoComment(Long commentId) {
        return coCommentRepository.findAllByCommentId(commentId)
                .stream()
                .map(QueryCoCommentResponse::new)
                .collect(Collectors.toList());
    }

}
