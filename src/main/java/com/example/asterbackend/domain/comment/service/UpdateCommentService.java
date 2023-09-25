package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.presentation.request.CreateAndUpdateCommentRequest;
import com.example.asterbackend.domain.comment.repository.CommentRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {

    private final CommentRepository commentRepository;

    private final UserFacade userFacade;

    @Transactional
    public void updateComment(Long feedId, CreateAndUpdateCommentRequest request) {
        User user = userFacade.getCurrentUser();

        Comment comment = commentRepository.findByFeedIdAndNickname(feedId, user.getNickname());

        comment.updateContent(request.getContent());
    }

}
