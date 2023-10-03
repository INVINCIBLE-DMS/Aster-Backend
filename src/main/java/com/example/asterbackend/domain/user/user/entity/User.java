package com.example.asterbackend.domain.user.user.entity;

import com.example.asterbackend.domain.user.user.entity.type.Part;
import com.example.asterbackend.domain.user.user.entity.type.Sex;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name = "nickname", nullable = false, length = 20)
    private String nickname;

    @Column(name = "username", nullable = false, length = 4)
    private String username;

    @Column(name = "student_id", nullable = false, length = 4)
    private String studentId;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex", nullable = false)
    private Sex sex;

    @Enumerated(EnumType.STRING)
    @Column(name = "part", nullable = false)
    private Part part;

    @Column(name = "candy", nullable = false)
    private int candy = 0;

    @Column(name = "social_type_score", nullable = false)
    private int socialTypeScore = 0;

    @Column(name = "knowledge_type_score", nullable = false)
    private int knowledgeTypeScore = 0;

    @Column(name = "emotion_type_score", nullable = false)
    private int emotionTypeScore = 0;

    @Column(name = "decision_type_score", nullable = false)
    private int decisionTypeScore = 0;

    @Column(name = "profile_image")
    private String profileImageUrl;

    public void addSurveyCandy() {
        this.candy+=200;
    }

    public void addSocialTypeScore(int score) {
        this.socialTypeScore+=score;
    }

    public void addKnowledgeTypeScore(int score) {
        this.socialTypeScore+=score;
    }

    public void addEmotionTypeScore(int score) {
        this.socialTypeScore+=score;
    }

    public void addDecisionTypeScore(int score) {
        this.socialTypeScore+=score;
    }

    public void profileUpload(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public void minusCandy() {
        this.candy-=50;
    }

}