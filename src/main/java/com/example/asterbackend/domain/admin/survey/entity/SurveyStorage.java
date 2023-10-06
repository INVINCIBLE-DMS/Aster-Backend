package com.example.asterbackend.domain.admin.survey.entity;

import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
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

    @Column(name = "survey_image", length = 25)
    private String surveyImageUrl;

}
