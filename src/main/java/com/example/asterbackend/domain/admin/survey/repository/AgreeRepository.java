package com.example.asterbackend.domain.admin.survey.repository;

import com.example.asterbackend.domain.admin.survey.entity.Agree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreeRepository extends JpaRepository<Agree, Long> {
    boolean existsBySurveyIdAndNickname(Long surveyId, String nickname);
    void deleteBySurveyIdAndNickname(Long surveyId, String nickname);
}
