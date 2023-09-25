package com.example.asterbackend.domain.comment.repository;

import com.example.asterbackend.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    boolean existsByFeedIdAndNickname(Long feedId, String nickname);
}
