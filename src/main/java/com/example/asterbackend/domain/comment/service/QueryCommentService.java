package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.presentation.response.QueryCommentResponse;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryCommentService {

    private final CommentRepository commentRepository;

    public List<QueryCommentResponse> queryComment(Long feedId) {
        return commentRepository.findAllByFeedId(feedId)
                .stream()
                .map(QueryCommentResponse::new)
                .collect(Collectors.toList());
    }

}
