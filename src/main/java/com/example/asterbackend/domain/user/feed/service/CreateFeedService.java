package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.presentation.dto.request.FeedRequest;
import com.example.asterbackend.domain.user.feed.repository.FeedRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CreateFeedService {

    private final FeedRepository feedRepository;

    private final UserFacade userFacade;

    public void createFeed(FeedRequest request) {
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
