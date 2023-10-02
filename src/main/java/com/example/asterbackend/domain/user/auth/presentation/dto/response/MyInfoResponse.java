package com.example.asterbackend.domain.user.auth.presentation.dto.response;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.entity.type.Part;
import com.example.asterbackend.domain.user.user.entity.type.Sex;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@RequiredArgsConstructor
public class MyInfoResponse {

    private String username;

    private String nickname;

    private String studentId;

    private String profileImageUrl;

    @Enumerated(EnumType.STRING)
    private Part part;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    public MyInfoResponse(User user) {
        username = user.getUsername();
        nickname = user.getNickname();
        studentId = user.getStudentId();
        profileImageUrl = user.getProfileImageUrl();
        part = user.getPart();
        sex = user.getSex();
    }
}
