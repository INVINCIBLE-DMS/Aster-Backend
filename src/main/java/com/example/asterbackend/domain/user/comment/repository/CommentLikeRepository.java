package com.example.asterbackend.domain.user.comment.repository;

import com.example.asterbackend.domain.user.comment.entity.CommentLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    boolean existsByCommentIdAndNickname(Long commentId, String nickname);

    void deleteByCommentIdAndNickname(Long commentId, String nickname);
}
