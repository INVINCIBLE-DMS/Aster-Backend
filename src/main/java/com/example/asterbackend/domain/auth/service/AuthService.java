package com.example.asterbackend.domain.user.service;

import com.example.asterbackend.domain.user.presentation.dto.request.SignupRequest;

public interface AuthService {
    void signup(SignupRequest request);
}


