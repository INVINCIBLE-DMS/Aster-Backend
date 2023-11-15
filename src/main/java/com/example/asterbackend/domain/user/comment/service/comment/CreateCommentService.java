package com.example.asterbackend.domain.user.comment.service.comment;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.user.comment.repository.CommentRepository;
import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.facade.FeedFacade;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
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
                        .user(user)
                        .feed(feed)
                        .build());
    }

}
