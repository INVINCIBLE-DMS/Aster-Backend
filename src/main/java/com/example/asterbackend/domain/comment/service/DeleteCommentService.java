package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.facade.FeedFacade;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {

    private final CommentRepository commentRepository;

    private final UserFacade userFacade;

    private final FeedFacade feedFacade;

    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }

}
