package com.example.asterbackend.domain.admin.user.facade;

import com.example.asterbackend.domain.admin.user.entity.Admin;
import com.example.asterbackend.domain.admin.user.repository.AdminRepository;
import com.example.asterbackend.global.exception.user.NotAuthenticatedException;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminFacade {

    private final AdminRepository adminRepository;

    public Admin getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication == null || !authentication.isAuthenticated())
            throw new NotAuthenticatedException("인증되지 않은 사용자입니다.");

        String nickname = authentication.getName();

        return adminRepository.findByUsername(nickname)
                .orElseThrow(()->UserNotFoundException.EXCEPTION);
    }
    
}