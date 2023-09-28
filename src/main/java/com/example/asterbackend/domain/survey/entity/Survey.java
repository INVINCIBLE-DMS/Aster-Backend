package com.example.asterbackend.domain.survey.entity;

import com.example.asterbackend.domain.user.entity.User;
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

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nickname")
    private User user;

    private String agree;

    private int agreeCnt = 0;

    public void addAgree() {
        agreeCnt++;
    }

    public void cancelAgree(){
        agreeCnt--;
    }

}
