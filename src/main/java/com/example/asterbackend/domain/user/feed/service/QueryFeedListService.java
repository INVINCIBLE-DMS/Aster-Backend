package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.presentation.dto.response.FeedListResponse;
import com.example.asterbackend.domain.user.feed.repository.FeedRepository;
import com.example.asterbackend.domain.user.feed.repository.LikeRepository;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryFeedListService {

    private final FeedRepository feedRepository;
    private final UserFacade userFacade;
    private final LikeRepository likeRepository;

    public List<FeedListResponse> queryFeedList() {

        String studentId = userFacade.getStudentId();

        List<Feed> allFeeds = feedRepository.findAll();

        return allFeeds.stream()
                .map(feed -> {
                    boolean isLiked = likeRepository.existsByFeedAndStudentId(feed, studentId);
                    return new FeedListResponse(feed, isLiked);
                })
                .collect(Collectors.toList());
    }

}
