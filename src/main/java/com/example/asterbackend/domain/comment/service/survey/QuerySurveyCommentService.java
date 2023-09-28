package com.example.asterbackend.domain.comment.service.survey;

import com.example.asterbackend.domain.comment.presentation.response.SurveyCommentResponse;
import com.example.asterbackend.domain.comment.repository.SurveyCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuerySurveyCommentService {

    private final SurveyCommentRepository surveyCommentRepository;

    public List<SurveyCommentResponse> querySurveyComment(Long surveyId) {
        return surveyCommentRepository.findAllBySurveyId(surveyId)
                .stream()
                .map(SurveyCommentResponse::new)
                .collect(Collectors.toList());
    }

}