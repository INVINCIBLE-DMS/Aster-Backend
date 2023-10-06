package com.example.asterbackend.domain.admin.survey.service;

import com.example.asterbackend.domain.admin.survey.presentation.dto.SurveyListResponse;
import com.example.asterbackend.domain.admin.survey.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuerySurveyService {

    private final SurveyRepository surveyRepository;

    public List<SurveyListResponse> querySurvey() {
        return surveyRepository.findAll()
                .stream()
                .map(SurveyListResponse::new)
                .collect(Collectors.toList());
    }

}
