package com.example.asterbackend.domain.feed.service;

import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.presentation.dto.request.CreateFeedRequest;
import com.example.asterbackend.domain.feed.repository.FeedRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CreateFeedService {

    private final FeedRepository feedRepository;

    private final UserFacade userFacade;

    public void createFeed(CreateFeedRequest request) {
        LocalDateTime now = LocalDateTime.now();

        User user = userFacade.getCurrentUser();

        feedRepository.save(
                Feed.builder()
                        .content(request.getContent())
                        .user(user)
                        .createAt(now)
                        .build());
    }

}
