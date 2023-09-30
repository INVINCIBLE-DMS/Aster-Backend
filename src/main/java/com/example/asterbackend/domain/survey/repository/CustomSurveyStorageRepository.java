package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.entity.type.SurveyType;

import java.util.List;

public interface CustomSurveyStorageRepository {
    List<SurveyStorage> findEnumSurvey(SurveyType surveyType);
}