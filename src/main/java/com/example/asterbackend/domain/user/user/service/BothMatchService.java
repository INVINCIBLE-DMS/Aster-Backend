package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.facade.SchoolClassFacade;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.domain.user.user.presentation.dto.request.BothMatchRequest;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BothMatchService {

    private final UserFacade userFacade;

    private final UserRepository userRepository;

    private final SchoolClassFacade schoolClassFacade;

    public int bothMatch(BothMatchRequest request) {
        User me = userFacade.getCurrentUser();

        User user1 = userRepository.findByUsername(request.getUsername1())
                .orElseThrow(()->UserNotFoundException.EXCEPTION);

        User user2 = userRepository.findByUsername(request.getUsername2())
                .orElseThrow(()->UserNotFoundException.EXCEPTION);

        if(me.getStudentId().substring(0, 1).equals(user1.getStudentId().substring(0,1))) return 0;
        else {
            Long grade = Long.parseLong(user1.getStudentId().substring(0, 1));
            Long classNumber = Long.parseLong(user1.getStudentId().substring(1, 2));

            SchoolClass schoolClass = schoolClassFacade.currentSchoolClass(grade, classNumber);

            schoolClass.addCandy100();
        }

        if(me.getStudentId().substring(0, 1).equals(user2.getStudentId().substring(0,1))) return 0;
        else {
            Long grade = Long.parseLong(user2.getStudentId().substring(0, 1));
            Long classNumber = Long.parseLong(user2.getStudentId().substring(1, 2));

            SchoolClass schoolClass = schoolClassFacade.currentSchoolClass(grade, classNumber);

            schoolClass.addCandy100();
        }

        int socialScore, knowledgeScore, emotionScore, decisionScore;

        socialScore = 100 - Math.abs(user1.getSocialTypeScore() - user2.getSocialTypeScore());
        knowledgeScore = 100 - Math.abs(user1.getKnowledgeTypeScore() - user2.getKnowledgeTypeScore());
        emotionScore = 100 - Math.abs(user1.getEmotionTypeScore() - user2.getEmotionTypeScore());
        decisionScore = 100 - Math.abs(user1.getDecisionTypeScore() - user2.getDecisionTypeScore());

        return (socialScore + knowledgeScore + emotionScore + decisionScore)/4;
    }

}
