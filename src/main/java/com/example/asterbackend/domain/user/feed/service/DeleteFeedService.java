package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteFeedService {

    private final FeedRepository feedRepository;

    public void deleteFeed(Long feedId) {
        feedRepository.deleteById(feedId);
    }

}
