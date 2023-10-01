package com.example.asterbackend.domain.admin.survey.repository;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.user.survey.repository.CustomSurveyStorageRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyStorageRepository extends JpaRepository<SurveyStorage, Long>, CustomSurveyStorageRepository {
}
