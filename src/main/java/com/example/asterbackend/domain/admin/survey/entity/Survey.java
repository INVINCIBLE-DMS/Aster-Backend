package com.example.asterbackend.domain.admin.survey.entity;

import com.example.asterbackend.domain.admin.survey.entity.type.SurveyType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false, length = 50)
    private String content;

    @Column(name = "is_update", nullable = false)
    private boolean isUpdate = false;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "survey_image")
    private String surveyImageUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "survey_type", nullable = false)
    private SurveyType surveyType;

    @Column(name = "agree_cnt", nullable = false)
    private int agreeCnt = 0;

    public void updateSurvey(String content, SurveyType surveyType) {
        this.surveyType = surveyType;
        this.content = content;
        this.isUpdate = true;
    }

    public void addAgree() {
        agreeCnt++;
    }

    public void cancelAgree() {
        agreeCnt--;
    }

}
