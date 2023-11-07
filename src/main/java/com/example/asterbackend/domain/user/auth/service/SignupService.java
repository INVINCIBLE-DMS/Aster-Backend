package com.example.asterbackend.domain.user.auth.service;

import com.example.asterbackend.domain.user.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.student.repository.StudentRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.entity.type.Role;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.NotStudentException;
import com.example.asterbackend.global.exception.user.UserExistsException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;

    private final StudentRepository studentRepository;

    private final JwtTokenProvider jwtTokenProvider;

    @Transactional
    public TokenResponse signup(SignupRequest request) {
        if(!studentRepository.findByStudentId(request.getStudentId()).isPresent()) {
            throw NotStudentException.EXCEPTION;
        }

        if(userRepository.findByStudentId(request.getStudentId()).isPresent()) {
            throw UserExistsException.EXCEPTION;
        }

        userRepository.save(
                User.builder()
                        .username(request.getUsername())
                        .studentId(request.getStudentId())
                        .role(Role.GENERAL)
                        .profileImgUrl(request.getProfileImgUrl())
                        .build());

        studentRepository.deleteByStudentId(request.getStudentId());
        return jwtTokenProvider.receiveToken(request.getStudentId());
    }

}
