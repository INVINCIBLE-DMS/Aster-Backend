package com.example.asterbackend.domain.comment.service.comment;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.facade.FeedFacade;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCommentService {

    private final CommentRepository commentRepository;

    private final FeedFacade feedFacade;

    private final UserFacade userFacade;

    public void createComment(Long feedId, CommentRequest request) {
        Feed feed = feedFacade.currentFeed(feedId);

        User user = userFacade.getCurrentUser();

        commentRepository.save(
                Comment.builder()
                        .content(request.getContent())
                        .nickname(user.getNickname())
                        .feed(feed)
                        .build());
    }

}
