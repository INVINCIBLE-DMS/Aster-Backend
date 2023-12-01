package com.example.asterbackend.domain.user.comment.service.comment;

import com.example.asterbackend.domain.user.comment.presentation.response.FeedAndCommentsResponse;
import com.example.asterbackend.domain.user.comment.presentation.response.QueryCommentResponse;
import com.example.asterbackend.domain.user.comment.repository.CommentRepository;
import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.facade.FeedFacade;
import com.example.asterbackend.domain.user.feed.presentation.dto.response.FeedListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryCommentService {

    private final FeedFacade feedFacade;

    private final CommentRepository commentRepository;

    public FeedAndCommentsResponse queryComment(Long feedId) {
        Feed feed = feedFacade.currentFeed(feedId);

        FeedListResponse feedResponse = new FeedListResponse(feed);

        List<QueryCommentResponse> commentList = commentRepository.findAllByFeedId(feedId)
                .stream()
                .map(QueryCommentResponse::new)
                .collect(Collectors.toList());

        return new FeedAndCommentsResponse(feedResponse, commentList);
    }

}
