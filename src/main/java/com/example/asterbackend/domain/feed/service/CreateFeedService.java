package com.example.asterbackend.domain.feed.service;

import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.presentation.dto.request.CreateFeedRequest;
import com.example.asterbackend.domain.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CreateFeedService {

    private final FeedRepository feedRepository;

    public void createFeed(CreateFeedRequest request) {
        LocalDateTime now = LocalDateTime.now();

        feedRepository.save(
                Feed.builder()
                        .content(request.getContent())
                        .writeTime(now)
                        .build());
    }

}
