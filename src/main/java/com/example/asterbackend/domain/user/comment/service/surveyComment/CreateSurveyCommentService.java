package com.example.asterbackend.domain.user.comment.service.surveyComment;

import com.example.asterbackend.domain.user.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.user.comment.entity.SurveyComment;
import com.example.asterbackend.domain.user.comment.repository.SurveyCommentRepository;
import com.example.asterbackend.domain.admin.survey.entity.Survey;
import com.example.asterbackend.domain.admin.survey.facade.SurveyFacade;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateSurveyCommentService {

    private final SurveyCommentRepository surveyCommentRepository;

    private final SurveyFacade surveyFacade;

    private final UserFacade userFacade;

    public void createSurveyComment(Long surveyId, CommentRequest request) {
        Survey survey = surveyFacade.currentSurvey(surveyId);

        User user = userFacade.getCurrentUser();

        surveyCommentRepository.save(
                SurveyComment.builder()
                        .content(request.getContent())
                        .nickname(user.getNickname())
                        .survey(survey)
                        .build());
    }

}
