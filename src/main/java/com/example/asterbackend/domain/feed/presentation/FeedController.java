package com.example.asterbackend.domain.feed.presentation;

import com.example.asterbackend.domain.feed.presentation.dto.request.FeedRequest;
import com.example.asterbackend.domain.feed.presentation.dto.response.FeedListResponse;
import com.example.asterbackend.domain.feed.service.CreateFeedService;
import com.example.asterbackend.domain.feed.service.DeleteFeedService;
import com.example.asterbackend.domain.feed.service.QueryFeedListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/feed")
public class FeedController {

    private final CreateFeedService createFeedService;

    private final QueryFeedListService queryFeedListService;

    private final DeleteFeedService deleteFeedService;

    @PostMapping()
    public void createFeed(@RequestBody @Valid FeedRequest request) {
        createFeedService.createFeed(request);
    }

    @GetMapping()
    public List<FeedListResponse> queryFeedList() {
        return queryFeedListService.queryFeedList();
    }

    @DeleteMapping("/{feedId}")
    public void removeFeed(@PathVariable Long feedId) {
        deleteFeedService.deleteFeed(feedId);
    }

}
