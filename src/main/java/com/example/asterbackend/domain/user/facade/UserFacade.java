package com.example.asterbackend.domain.user.facade;


import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.NotAuthenticatedException;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserRepository userRepository;

    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication == null || !authentication.isAuthenticated())
            throw new NotAuthenticatedException("인증되지 않은 사용자입니다.");

        String nickname = authentication.getName();

        return userRepository.findByNickname(nickname)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}
