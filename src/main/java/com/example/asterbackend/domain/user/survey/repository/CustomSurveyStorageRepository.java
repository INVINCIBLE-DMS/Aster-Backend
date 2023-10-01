package com.example.asterbackend.domain.user.survey.repository;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;

import java.util.List;

public interface CustomSurveyStorageRepository {
    List<SurveyStorage> findEnumSurvey(SurveyType surveyType);
}