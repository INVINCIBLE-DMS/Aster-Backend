package com.example.asterbackend.domain.user.comment.repository;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByFeedId(Long feedId);
}
