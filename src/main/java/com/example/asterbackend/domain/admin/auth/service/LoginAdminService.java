package com.example.asterbackend.domain.admin.auth.service;

import com.example.asterbackend.domain.admin.auth.presentation.dto.request.LoginAdminRequest;
import com.example.asterbackend.domain.admin.user.entity.Admin;
import com.example.asterbackend.domain.admin.user.repository.AdminRepository;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.global.exception.user.NotAdminException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginAdminService {

    private final AdminRepository adminRepository;

    private final JwtTokenProvider jwtTokenProvider;

    public TokenResponse login(LoginAdminRequest request) {
        if(!request.getSecretKey().equals(("${key.secretKey}"))) {
            throw NotAdminException.EXCEPTION;
        }

        adminRepository.save(
                Admin.builder()
                        .username(request.getUsername())
                        .build());

        return jwtTokenProvider.receiveToken(request.getUsername());
    }

}
