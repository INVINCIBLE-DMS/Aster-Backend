package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserService {

    private final UserRepository userRepository;

    public void deleteAllUser() {
        userRepository.deleteAll();
    }
}
