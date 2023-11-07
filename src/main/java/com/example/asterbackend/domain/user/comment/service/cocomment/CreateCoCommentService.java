package com.example.asterbackend.domain.user.comment.service.cocomment;

import com.example.asterbackend.domain.user.comment.entity.CoComment;
import com.example.asterbackend.domain.user.comment.entity.Comment;
import com.example.asterbackend.domain.user.comment.facade.CommentFacade;
import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.user.comment.repository.CoCommentRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCoCommentService {

    private final CoCommentRepository coCommentRepository;

    private final CommentFacade commentFacade;

    private final UserFacade userFacade;

    public void createCoComment(Long commentId, CommentRequest commentRequest) {
        Comment comment = commentFacade.currentComment(commentId);

        User user = userFacade.getCurrentUser();

        coCommentRepository.save(
                CoComment.builder()
                        .content(commentRequest.getContent())
                        .studentId(user.getStudentId())
                        .comment(comment)
                        .build());
    }

}