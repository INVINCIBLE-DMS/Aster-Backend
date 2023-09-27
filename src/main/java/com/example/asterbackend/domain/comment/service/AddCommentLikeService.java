package com.example.asterbackend.domain.comment.service;

import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.entity.CommentLike;
import com.example.asterbackend.domain.comment.facade.CommentFacade;
import com.example.asterbackend.domain.comment.repository.CommentLikeRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddCommentLikeService {

    private final CommentFacade commentFacade;

    private final UserFacade userFacade;

    private final CommentLikeRepository commentLikeRepository;

    @Transactional
    public void addCommentLike(Long commentId) {
        Comment comment = commentFacade.currentComment(commentId);

        User user = userFacade.getCurrentUser();

        if (commentLikeRepository.existsByCommentIdAndNickname(commentId, user.getNickname())) {
            comment.cancelCommentLike(comment);

            commentLikeRepository.deleteByCommentIdAndNickname(commentId, user.getNickname());
        }
        else {
            comment.addCommentLike(comment);

            commentLikeRepository.save(
                    CommentLike.builder()
                            .nickname(user.getNickname())
                            .comment(comment)
                            .build());
        }
    }

}
