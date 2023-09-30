package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.entity.type.SurveyType;

import java.util.List;

public interface CustomSurveyStorageRepository {
    List<Survey> findEnumSurvey(SurveyType surveyType);
}