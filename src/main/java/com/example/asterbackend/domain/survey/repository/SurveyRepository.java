package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Long> {
}
