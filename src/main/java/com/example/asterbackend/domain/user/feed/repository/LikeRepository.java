package com.example.asterbackend.domain.user.feed.repository;

import com.example.asterbackend.domain.user.feed.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
    boolean existsByFeedIdAndNickname(Long feedId, String nickname);

    void deleteByFeedIdAndNickname(Long feedId, String nickname);
}
