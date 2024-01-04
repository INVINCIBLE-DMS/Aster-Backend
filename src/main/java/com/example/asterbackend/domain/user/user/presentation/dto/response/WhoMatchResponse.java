package com.example.asterbackend.domain.user.user.presentation.dto.response;

import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WhoMatchResponse {

    private int matchScore;

    private String profileImgUrl;

    private String username;

    public WhoMatchResponse(int score, User user) {
        matchScore = score;
        profileImgUrl = user.getProfileImgUrl();
        username = user.getUsername();
    }

}
