package com.example.asterbackend.domain.auth.service;

import com.example.asterbackend.domain.auth.presentation.dto.request.SignupRequest;

public interface AuthService {
    void signup(SignupRequest request);
}


