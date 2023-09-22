package com.example.asterbackend.domain.user.service;

import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.user.repository.UserRepository;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public void signup(SignupRequest request) {

        User user = User.builder()
                .username(request.getUsername())
                .nickname(request.getNickname())
                .sex(request.getSex())
                .part(request.getPart())
                .build();

        userRepository.save(user);
        }
    }

