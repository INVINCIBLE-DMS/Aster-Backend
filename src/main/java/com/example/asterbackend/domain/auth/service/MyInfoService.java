package com.example.asterbackend.domain.auth.service;

import com.example.asterbackend.domain.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyInfoService {

    private final UserFacade userFacade;

    @Autowired
    public MyInfoResponse getMyInfo() {

        User user = userFacade.getCurrentUser();

        return new MyInfoResponse(user);
    }
}
