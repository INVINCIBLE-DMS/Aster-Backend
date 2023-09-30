package com.example.asterbackend.domain.comment.service.surveyComment;

import com.example.asterbackend.domain.comment.presentation.request.CommentRequest;
import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.comment.entity.SurveyComment;
import com.example.asterbackend.domain.survey.facade.SurveyFacade;
import com.example.asterbackend.domain.comment.repository.SurveyCommentRepository;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
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
