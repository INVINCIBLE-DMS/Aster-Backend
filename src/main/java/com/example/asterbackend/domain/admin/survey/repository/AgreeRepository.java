package com.example.asterbackend.domain.admin.survey.repository;

import com.example.asterbackend.domain.admin.survey.entity.Agree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreeRepository extends JpaRepository<Agree, Long> {
    boolean existsBySurveyIdAndUsername(Long surveyId, String username);
    void deleteBySurveyIdAndUsername(Long surveyId, String username);
}
