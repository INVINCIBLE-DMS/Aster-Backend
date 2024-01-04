package com.example.asterbackend.domain.user.auth.service;

import com.example.asterbackend.domain.user.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.facade.SchoolClassFacade;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.entity.type.Role;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserExistsException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;

    private final JwtTokenProvider jwtTokenProvider;

    private final SchoolClassFacade schoolClassFacade;

    @Transactional
    public TokenResponse signup(SignupRequest request) {
        if(userRepository.findByStudentId(request.getStudentId()).isPresent()) {
            return jwtTokenProvider.receiveToken(request.getStudentId());
        }

        SchoolClass schoolClass = schoolClassFacade.currentSchoolClass(Long.parseLong(request.getStudentId())/1000, Long.parseLong(request.getStudentId())/100%10);

        userRepository.save(
                User.builder()
                        .username(request.getUsername())
                        .studentId(request.getStudentId())
                        .role(Role.GENERAL)
                        .schoolClass(schoolClass)
                        .profileImgUrl(request.getProfileImgUrl())
                        .build());

        return jwtTokenProvider.receiveToken(request.getStudentId());
    }

}
