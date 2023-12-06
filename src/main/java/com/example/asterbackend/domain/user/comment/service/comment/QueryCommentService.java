package com.example.asterbackend.domain.user.comment.service.comment;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.presentation.response.FeedAndCommentsResponse;
import com.example.asterbackend.domain.user.comment.presentation.response.QueryCommentResponse;
import com.example.asterbackend.domain.user.comment.repository.CommentLikeRepository;
import com.example.asterbackend.domain.user.comment.repository.CommentRepository;
import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.facade.FeedFacade;
import com.example.asterbackend.domain.user.feed.presentation.dto.response.FeedListResponse;
import com.example.asterbackend.domain.user.feed.repository.LikeRepository;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryCommentService {

    private final FeedFacade feedFacade;

    private final CommentRepository commentRepository;

    private final LikeRepository likeRepository;

    private final UserFacade userFacade;

    private final CommentLikeRepository commentLikeRepository;


    public FeedAndCommentsResponse queryComment(Long feedId) {
        Feed feed = feedFacade.currentFeed(feedId);
        String studentId = userFacade.getStudentId();

        boolean isLiked = likeRepository.existsByFeedAndStudentId(feed, studentId);
        FeedListResponse feedResponse = new FeedListResponse(feed, isLiked);

        List<Comment> allComments = commentRepository.findAllByFeedId(feedId);

        List<QueryCommentResponse> commentList = allComments
                .stream()
                .map(comment -> {
                    boolean commentLiked = commentLikeRepository.existsByCommentAndStudentId(comment, studentId);
                    return new QueryCommentResponse(comment, commentLiked);
                })
                .collect(Collectors.toList());

        return new FeedAndCommentsResponse(feedResponse, commentList);
    }

}
