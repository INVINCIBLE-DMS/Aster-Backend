package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.comment.repository.CoCommentRepository;
import com.example.asterbackend.domain.user.comment.repository.CommentRepository;
import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.repository.FeedRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.global.exception.feed.FeedNotFoundException;
import com.example.asterbackend.global.exception.user.WriterMismatchException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.asterbackend.domain.user.user.entity.type.Role.ADMIN;
import static com.example.asterbackend.global.error.exception.ErrorCode.WRITER_MISMATCH;

@Service
@RequiredArgsConstructor
public class DeleteFeedService {

    private final FeedRepository feedRepository;

    private final UserFacade userFacade;

    public void deleteFeed(Long feedId) {

        User currentUser = userFacade.getCurrentUser();

        Feed feed = feedRepository.findById(feedId)
                .orElseThrow(()-> FeedNotFoundException.EXCEPTION);

        if (!currentUser.equals(feed.getUser())) {
            throw WriterMismatchException.EXCEPTION;
        }

        feedRepository.delete(feed);
    }

}
