package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.facade.SchoolClassFacade;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WhoMatchService {

    private final UserRepository userRepository;

    private final UserFacade userFacade;

    private final SchoolClassFacade schoolClassFacade;

    public int whoMatch(String username) {
        User me = userFacade.getCurrentUser();

        User user = userRepository.findByUsername(username)
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        if(me.getStudentId().substring(0, 1).equals(user.getStudentId().substring(0,1))) return 0;
        else {
            Long grade = Long.parseLong(user.getStudentId().substring(0, 1));
            Long classNumber = Long.parseLong(user.getStudentId().substring(1, 2));

            SchoolClass schoolClass = schoolClassFacade.currentSchoolClass(grade, classNumber);

            schoolClass.addCandy(100);
        }

        int socialScore, knowledgeScore, emotionScore, decisionScore;

        socialScore = 100 - Math.abs(me.getSocialTypeScore() - user.getSocialTypeScore());
        knowledgeScore = 100 - Math.abs(me.getKnowledgeTypeScore() - user.getKnowledgeTypeScore());
        emotionScore = 100 - Math.abs(me.getEmotionTypeScore() - user.getEmotionTypeScore());
        decisionScore = 100 - Math.abs(me.getDecisionTypeScore() - user.getDecisionTypeScore());

        return (socialScore + knowledgeScore + emotionScore + decisionScore)/4;
    }

}
