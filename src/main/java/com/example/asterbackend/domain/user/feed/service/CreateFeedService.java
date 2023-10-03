package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.presentation.dto.request.FeedRequest;
import com.example.asterbackend.domain.user.feed.repository.FeedRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.infra.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CreateFeedService {

    private final FeedRepository feedRepository;

    private final S3Util s3Util;

    private final UserFacade userFacade;

    @Transactional
    public void createFeed(FeedRequest request, MultipartFile feedImage) {
        LocalDateTime now = LocalDateTime.now();

        User user = userFacade.getCurrentUser();

        String feedImageUrl = s3Util.upload(feedImage);

        feedRepository.save(
                Feed.builder()
                        .content(request.getContent())
                        .user(user)
                        .feedImageUrl(feedImageUrl)
                        .createAt(now)
                        .build());
    }

}
