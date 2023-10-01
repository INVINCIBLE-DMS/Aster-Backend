package com.example.asterbackend.global.security.auth;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nickname) {

        User user = userRepository.findByNickname(nickname)
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        return new CustomUserDetails(user);
    }

}
