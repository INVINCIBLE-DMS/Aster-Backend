package com.example.asterbackend.domain.feed.service;

import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.facade.FeedFacade;
import com.example.asterbackend.domain.feed.presentation.dto.request.CreateAndUpdateFeedRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateFeedService {

    private final FeedFacade feedFacade;

    @Transactional
    public void updateFeed(CreateAndUpdateFeedRequest request, Long feedId) {
        Feed feed = feedFacade.currentFeed(feedId);

        feed.updateTitleAndContent(request.getContent());
    }

}
