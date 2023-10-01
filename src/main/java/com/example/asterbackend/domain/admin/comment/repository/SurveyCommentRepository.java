package com.example.asterbackend.domain.admin.comment.repository;

import com.example.asterbackend.domain.admin.comment.entity.SurveyComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyCommentRepository extends JpaRepository<SurveyComment, Long> {
    List<SurveyComment> findAllBySurveyId(Long surveyId);
}
