package com.example.asterbackend.domain.feed.presentation;

import com.example.asterbackend.domain.feed.presentation.dto.request.CreateFeedRequest;
import com.example.asterbackend.domain.feed.presentation.dto.request.UpdateFeedRequest;
import com.example.asterbackend.domain.feed.presentation.dto.response.FeedListResponse;
import com.example.asterbackend.domain.feed.service.CreateFeedService;
import com.example.asterbackend.domain.feed.service.DeleteFeedService;
import com.example.asterbackend.domain.feed.service.QueryFeedListService;
import com.example.asterbackend.domain.feed.service.UpdateFeedService;
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

    private final UpdateFeedService updateFeedService;

    private final DeleteFeedService deleteFeedService;

    @PostMapping()
    public void createFeed(@RequestBody @Valid CreateFeedRequest createFeedRequest) {
        createFeedService.createFeed(createFeedRequest);
    }

    @GetMapping()
    public List<FeedListResponse> queryFeedList() {
        return queryFeedListService.queryFeedList();
    }

    @PatchMapping("/{feedId}")
    public void updateFeed(@RequestBody @Valid UpdateFeedRequest updateFeedRequest, @PathVariable Long feedId) {
        updateFeedService.updateFeed(updateFeedRequest, feedId);
    }

    @DeleteMapping("/{feedId}")
    public void removeFeed(@PathVariable Long feedId) {
        deleteFeedService.deleteFeed(feedId);
    }

}
