package com.example.asterbackend.domain.admin.auth.service;

import com.example.asterbackend.domain.admin.auth.presentation.dto.request.AdminLoginRequest;
import com.example.asterbackend.domain.admin.user.repository.AdminRepository;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.global.exception.user.NotAdminException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminLoginService {

    private final AdminRepository adminRepository;

    private final JwtTokenProvider jwtTokenProvider;

    public TokenResponse login(AdminLoginRequest request) {
        adminRepository.findByUsername(request.getUsername())
                        .orElseThrow(()-> NotAdminException.EXCEPTION);

        if(!request.getSecretKey().equals(("${key.secretKey}"))) {
            throw NotAdminException.EXCEPTION;
        }

        return jwtTokenProvider.receiveToken(request.getUsername());
    }

}
