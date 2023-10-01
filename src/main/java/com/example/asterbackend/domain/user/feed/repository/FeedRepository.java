package com.example.asterbackend.domain.user.feed.repository;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    void deleteById(Long feedId);
}
