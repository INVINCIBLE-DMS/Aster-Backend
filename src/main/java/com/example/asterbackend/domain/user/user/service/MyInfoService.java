package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyInfoService {

    private final UserFacade userFacade;

    public MyInfoResponse getMyInfo() {
        User user = userFacade.getCurrentUser();

        return new MyInfoResponse(user);
    }

}
