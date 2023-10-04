package com.example.asterbackend.domain.user.survey.entity;

import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import com.example.asterbackend.domain.user.survey.entity.type.AnswerType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SurveyResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SurveyType surveyType;

    @Enumerated(EnumType.STRING)
    private AnswerType answerType;

    private int surveyTypeScore;
}