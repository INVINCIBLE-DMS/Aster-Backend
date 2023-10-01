package com.example.asterbackend.domain.admin.survey.repository;

import com.example.asterbackend.domain.admin.survey.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Long> {
}