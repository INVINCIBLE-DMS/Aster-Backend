package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.domain.user.user.presentation.dto.request.WhoMatchRequest;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WhoMatchService {

    private final UserRepository userRepository;

    private final UserFacade userFacade;

    public int whoMatch(WhoMatchRequest request) {
        User user = userFacade.getCurrentUser();

        User who = userRepository.findByNickname(request.getStudentId())
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        int socialScore, knowledgeScore, emotionScore, decisionScore;

        socialScore = 100 - Math.abs(user.getSocialTypeScore() - who.getSocialTypeScore());
        knowledgeScore = 100 - Math.abs(user.getKnowledgeTypeScore() - who.getKnowledgeTypeScore());
        emotionScore = 100 - Math.abs(user.getEmotionTypeScore() - who.getEmotionTypeScore());
        decisionScore = 100 - Math.abs(user.getDecisionTypeScore() - who.getDecisionTypeScore());

        return (socialScore + knowledgeScore + emotionScore + decisionScore)/4;
    }

}
