package com.example.asterbackend.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class AuthServiceImpl {

    @Service
    @Transactional
    @RequiredArgsConstructor
    public class AuthServiceImpl implements AuthService{

        private final UserRepository userRepository;

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
}
