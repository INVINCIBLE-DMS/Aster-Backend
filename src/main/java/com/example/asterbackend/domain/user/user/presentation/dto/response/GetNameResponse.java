package com.example.asterbackend.domain.user.user.presentation.dto.response;

import com.example.asterbackend.domain.user.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GetNameResponse {

    private String username;

    public GetNameResponse(User user) {
        username = user.getUsername();
    }
}
