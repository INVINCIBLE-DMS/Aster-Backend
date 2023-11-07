package com.example.asterbackend.domain.user.comment.service;

import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.entity.CommentLike;
import com.example.asterbackend.domain.user.comment.facade.CommentFacade;
import com.example.asterbackend.domain.user.comment.repository.CommentLikeRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
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

        if (commentLikeRepository.existsByCommentIdAndStudentId(commentId, user.getStudentId())) {
            comment.cancelCommentLike(comment);

            commentLikeRepository.deleteByCommentIdAndStudentId(commentId, user.getStudentId());
        }
        else {
            comment.addCommentLike(comment);

            commentLikeRepository.save(
                    CommentLike.builder()
                            .studentId(user.getStudentId())
                            .comment(comment)
                            .build());
        }
    }

}
