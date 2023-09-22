package com.example.asterbackend.domain.auth.service;

import com.example.asterbackend.domain.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.auth.presentation.dto.response.MyInfoResponse;

public interface AuthService {
    void signup(SignupRequest request);

    MyInfoResponse getMyInfo();

}


