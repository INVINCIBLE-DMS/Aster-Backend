package com.example.asterbackend.domain.user.feed.repository;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
    boolean existsByFeedIdAndStudentId(Long feedId, String studentId);

    boolean existsByFeedAndStudentId(Feed feed, String studentId);

    void deleteByFeedIdAndStudentId(Long feedId, String studentId);
}
