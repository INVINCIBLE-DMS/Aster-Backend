package com.example.asterbackend.domain.user.comment.repository;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.entity.CommentLike;
import com.example.asterbackend.domain.user.feed.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    boolean existsByCommentIdAndStudentId(Long commentId, String studentId);

    boolean existsByCommentAndStudentId(Comment comment, String studentId);

    void deleteByCommentIdAndStudentId(Long commentId, String studentId);
}
