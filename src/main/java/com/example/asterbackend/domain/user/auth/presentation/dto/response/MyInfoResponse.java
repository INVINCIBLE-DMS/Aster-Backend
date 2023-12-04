package com.example.asterbackend.domain.user.auth.presentation.dto.response;

import com.example.asterbackend.domain.user.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@RequiredArgsConstructor
public class MyInfoResponse {

    private String username;

    private String studentId;

    private String profileImageUrl;

    private String test;

    public MyInfoResponse(User user) {
        username = user.getUsername();
        studentId = user.getStudentId();
        profileImageUrl = user.getProfileImgUrl();
        test = user.getUsername();
    }
}
