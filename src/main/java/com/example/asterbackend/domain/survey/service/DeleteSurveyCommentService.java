package com.example.asterbackend.domain.survey.service;

import com.example.asterbackend.domain.survey.repository.SurveyCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSurveyCommentService {

    private final SurveyCommentRepository surveyCommentRepository;

    public void deleteSurveyComment(Long surveyCommentId) {
        surveyCommentRepository.deleteById(surveyCommentId);
    }

}
