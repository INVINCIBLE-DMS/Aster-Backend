package com.example.asterbackend.domain.auth.service;

import com.example.asterbackend.domain.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.repository.UserRepository;
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

        User user = User.builder()
                .username(request.getUsername())
                .nickname(request.getNickname())
                .studentId(request.getStudentId())
                .sex(request.getSex())
                .part(request.getPart())
                .build();

        userRepository.save(user);

        return jwtTokenProvider.receiveToken(request.getNickname());
    }

}
