package com.example.asterbackend.domain.feed.facade;

import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.repository.FeedRepository;
import com.example.asterbackend.global.exception.feed.FeedNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FeedFacade {

    private final FeedRepository feedRepository;

    public Feed currentFeed(Long feedId) {
        return feedRepository.findById(feedId)
                .orElseThrow(()-> FeedNotFoundException.EXCEPTION);
    }

}
