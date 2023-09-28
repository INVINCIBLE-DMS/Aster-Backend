package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.SurveyComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyCommentRepository extends JpaRepository<SurveyComment, Long> {
}
