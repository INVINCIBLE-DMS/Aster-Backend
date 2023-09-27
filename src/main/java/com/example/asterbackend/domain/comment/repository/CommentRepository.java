package com.example.asterbackend.domain.comment.repository;

import com.example.asterbackend.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByFeedId(Long feedId);
}
