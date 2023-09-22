package com.example.asterbackend.domain.auth.presentation.dto.response;

import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.entity.type.Part;
import com.example.asterbackend.domain.user.entity.type.Sex;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@RequiredArgsConstructor
public class MyInfoResponse {

    private String username;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private Part part;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    public MyInfoResponse(User user) {
        username = user.getUsername();
        nickname = user.getNickname();
        part = user.getPart();
        sex = user.getSex();
    }
}
