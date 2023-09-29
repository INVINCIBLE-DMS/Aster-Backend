package com.example.asterbackend.domain.comment.service.cocomment;

import com.example.asterbackend.domain.comment.entity.CoComment;
import com.example.asterbackend.domain.comment.entity.Comment;
import com.example.asterbackend.domain.comment.facade.CommentFacade;
import com.example.asterbackend.domain.comment.repository.CoCommentRepository;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCoCommentService {

    private final CoCommentRepository coCommentRepository;

    private final CommentFacade commentFacade;

    private final UserFacade userFacade;

    public void createCoComment(Long commentId, SurveyRequest request) {
        Comment comment = commentFacade.currentComment(commentId);

        User user = userFacade.getCurrentUser();

        coCommentRepository.save(
                CoComment.builder()
                        .content(request.getContent())
                        .nickname(user.getNickname())
                        .comment(comment)
                        .build());
    }

}