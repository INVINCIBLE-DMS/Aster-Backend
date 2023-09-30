package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyStorageRepository extends JpaRepository<SurveyStorage, Long>, CustomSurveyStorageRepository {
}
