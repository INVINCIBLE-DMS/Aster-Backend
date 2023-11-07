package com.example.asterbackend.domain.user.feed.repository;

import com.example.asterbackend.domain.user.feed.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
    boolean existsByFeedIdAndStudentId(Long feedId, String studentId);

    void deleteByFeedIdAndStudentId(Long feedId, String studentId);
}
