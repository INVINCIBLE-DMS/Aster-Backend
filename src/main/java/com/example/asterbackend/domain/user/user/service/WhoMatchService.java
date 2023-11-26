package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.facade.SchoolClassFacade;
import com.example.asterbackend.domain.user.schoolClass.repository.SchoolClassRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.domain.user.user.presentation.dto.request.WhoMatchRequest;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.SchoolClassNotFoundException;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WhoMatchService {

    private final UserRepository userRepository;

    private final UserFacade userFacade;

    private final SchoolClassFacade schoolClassFacade;

    public int whoMatch(WhoMatchRequest request) {
        User user = userFacade.getCurrentUser();

        User who = userRepository.findByUsername(request.getUsername())
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        Long grade = Long.parseLong(who.getStudentId().substring(0, 1));
        Long classNumber = Long.parseLong(who.getStudentId().substring(1, 2));

        SchoolClass schoolClass = schoolClassFacade.currentSchoolClass(grade, classNumber);

        schoolClass.addCandy100();

        int socialScore, knowledgeScore, emotionScore, decisionScore;

        socialScore = 100 - Math.abs(user.getSocialTypeScore() - who.getSocialTypeScore());
        knowledgeScore = 100 - Math.abs(user.getKnowledgeTypeScore() - who.getKnowledgeTypeScore());
        emotionScore = 100 - Math.abs(user.getEmotionTypeScore() - who.getEmotionTypeScore());
        decisionScore = 100 - Math.abs(user.getDecisionTypeScore() - who.getDecisionTypeScore());

        return (socialScore + knowledgeScore + emotionScore + decisionScore)/4;
    }

}
