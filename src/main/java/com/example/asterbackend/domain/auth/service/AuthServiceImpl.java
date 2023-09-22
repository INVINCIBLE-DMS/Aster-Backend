package com.example.asterbackend.domain.auth.service;

import com.example.asterbackend.domain.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.user.facade.UserFacade;
import com.example.asterbackend.domain.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.UserExistsException;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final UserFacade userFacade;
    private final JwtTokenProvider jwtTokenProvider;

    public void duplicateNickname(String nickname) {

        if(userRepository.findByNickname(nickname).isPresent()) {
            throw UserExistsException.EXCEPTION;
        }
    }

    @Override
    public TokenResponse signup(SignupRequest request) {

        duplicateNickname(request.getNickname());

        User user = User.builder()
                .username(request.getUsername())
                .nickname(request.getNickname())
                .sex(request.getSex())
                .part(request.getPart())
                .build();

        userRepository.save(user);

        return jwtTokenProvider.receiveToken(request.getNickname());
        }


    @Override
    public MyInfoResponse getMyInfo() {

        User user = userFacade.getCurrentUser();

        return new MyInfoResponse(user);
    }
}

