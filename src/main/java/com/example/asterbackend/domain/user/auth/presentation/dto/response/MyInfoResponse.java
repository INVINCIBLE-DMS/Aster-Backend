package com.example.asterbackend.domain.user.auth.presentation.dto.response;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.entity.type.Sex;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@RequiredArgsConstructor
public class MyInfoResponse {

    private String username;

    private String studentId;

    private String profileImageUrl;

    public MyInfoResponse(User user) {
        username = user.getUsername();
        studentId = user.getStudentId();
        profileImageUrl = user.getProfileImgUrl();
    }
}
