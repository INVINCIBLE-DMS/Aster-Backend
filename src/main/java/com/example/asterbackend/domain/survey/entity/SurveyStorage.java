package com.example.asterbackend.domain.survey.entity;

import com.example.asterbackend.domain.survey.entity.type.SurveyType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SurveyStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false, length = 50)
    private String content;

    @Column(name = "survey_type", nullable = false)
    private SurveyType surveyType;

}
