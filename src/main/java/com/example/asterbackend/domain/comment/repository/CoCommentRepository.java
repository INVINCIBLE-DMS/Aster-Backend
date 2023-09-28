package com.example.asterbackend.domain.comment.repository;

import com.example.asterbackend.domain.comment.entity.CoComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoCommentRepository extends JpaRepository<CoComment, Long> {
}
