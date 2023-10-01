package com.example.asterbackend.domain.user.comment.repository;

import com.example.asterbackend.domain.user.comment.entity.SurveyComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyCommentRepository extends JpaRepository<SurveyComment, Long> {
    List<SurveyComment> findAllBySurveyId(Long surveyId);
}
