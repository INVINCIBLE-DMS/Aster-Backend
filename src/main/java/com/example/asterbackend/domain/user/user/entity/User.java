package com.example.asterbackend.domain.user.user.entity;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.user.entity.type.Role;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name = "student_id", length = 4)
    private String studentId;

    @Column(name = "username", length = 4)
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "grade", referencedColumnName = "grade"),
            @JoinColumn(name = "class_number", referencedColumnName = "class_number")
    })
    private SchoolClass schoolClass;

    @Column(name = "social_type_score", nullable = false)
    private int socialTypeScore;

    @Column(name = "knowledge_type_score", nullable = false)
    private int knowledgeTypeScore;

    @Column(name = "emotion_type_score", nullable = false)
    private int emotionTypeScore;

    @Column(name = "decision_type_score", nullable = false)
    private int decisionTypeScore;

    @Column(name = "profile_image")
    private String profileImgUrl;

    @Value("${key.secretKey}")
    private String secretKey;

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

}