package com.example.asterbackend.domain.admin.auth.service;

import com.example.asterbackend.domain.admin.auth.presentation.dto.request.LoginAdminRequest;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.entity.type.Authority;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.NotAdminException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginAdminService {

    private final UserRepository userRepository;

    private final JwtTokenProvider jwtTokenProvider;

    public TokenResponse login(LoginAdminRequest request) {

        User user = User.builder()
                .nickname(request.getUsername())
                .secretKey(request.getSecretKey())
                .authority(Authority.ADMIN)
                .build();

        if(!request.getSecretKey().equals((user.getSecretKey()))) {
            throw NotAdminException.EXCEPTION;
        }

        userRepository.save(user);

        return jwtTokenProvider.receiveToken(request.getUsername());
    }

}
