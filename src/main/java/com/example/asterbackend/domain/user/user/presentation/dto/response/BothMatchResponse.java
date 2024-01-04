package com.example.asterbackend.domain.user.user.presentation.dto.response;

import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BothMatchResponse {

    private int matchScore;

    private String user1profileImgUrl;

    private String user1username;

    private String user2profileImgUrl;

    private String user2username;

    public BothMatchResponse(int score, User user1, User user2) {
        matchScore = score;
        user1profileImgUrl = user1.getProfileImgUrl();
        user1username = user1.getUsername();
        user2profileImgUrl = user2.getProfileImgUrl();
        user2username = user2.getUsername();
    }

}
