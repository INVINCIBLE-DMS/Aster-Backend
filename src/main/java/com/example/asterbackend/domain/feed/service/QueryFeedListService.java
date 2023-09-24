package com.example.asterbackend.domain.feed.service;

import com.example.asterbackend.domain.feed.presentation.dto.response.FeedListResponse;
import com.example.asterbackend.domain.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryFeedListService {

    private final FeedRepository feedRepository;

    public List<FeedListResponse> queryFeedList() {
        return feedRepository.findAll()
                .stream()
                .map(FeedListResponse::new)
                .collect(Collectors.toList());
    }

}
