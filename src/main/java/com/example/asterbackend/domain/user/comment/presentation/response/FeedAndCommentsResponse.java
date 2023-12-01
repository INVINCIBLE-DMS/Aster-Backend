package com.example.asterbackend.domain.user.comment.presentation.response;

import com.example.asterbackend.domain.user.feed.presentation.dto.response.FeedListResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FeedAndCommentsResponse {

    private FeedListResponse feedResponse;

    private List<QueryCommentResponse> commentResponseList;
}
