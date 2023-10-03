package com.example.asterbackend.domain.user.auth.service;

import com.example.asterbackend.domain.user.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.entity.type.Authority;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserExistsException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;

    public TokenResponse signup(SignupRequest request) {

        if (userRepository.findByNickname(request.getNickname()).isPresent()) {
            throw UserExistsException.EXCEPTION;
        }

        userRepository.save(
                User.builder()
                        .nickname(request.getNickname())
                        .username(request.getUsername())
                        .studentId(request.getStudentId())
                        .sex(request.getSex())
                        .part(request.getPart())
                        .authority(Authority.GENERAL)
                        .build());;

        return jwtTokenProvider.receiveToken(request.getNickname());
    }

}
