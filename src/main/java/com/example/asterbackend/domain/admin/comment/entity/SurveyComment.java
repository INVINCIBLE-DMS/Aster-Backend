package com.example.asterbackend.domain.admin.comment.entity;

import com.example.asterbackend.domain.admin.survey.entity.Survey;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SurveyComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @Column(name = "is_update", nullable = false)
    private boolean isUpdated = false;

    @Column(name = "username", nullable = false)
    private String username;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "survey_id", nullable = false)
    private Survey survey;

    public void updateContent(String content) {
        this.content = content;
        this.isUpdated = true;
    }

}
