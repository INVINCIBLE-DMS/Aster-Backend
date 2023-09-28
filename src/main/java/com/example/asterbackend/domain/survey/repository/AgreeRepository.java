package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.Agree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreeRepository extends JpaRepository<Agree, Long> {

    boolean existsBySurveyIdAndNickname(Long surveyId, String nickname);

    void deleteBySurveyIdAndNickname(Long surveyId, String nickname);
}
