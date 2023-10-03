package com.example.asterbackend.domain.user.user.service;

import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.domain.user.user.presentation.dto.response.GetNameResponse;
import com.example.asterbackend.domain.user.user.repository.UserRepository;
import com.example.asterbackend.global.exception.user.CandyNotEnoughException;
import com.example.asterbackend.global.exception.user.UserNotFoundException;
import com.example.asterbackend.infra.util.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class GetNameService {

    private final UserFacade userFacade;
    private final UserRepository userRepository;
    @Transactional
    public GetNameResponse getName(String nickname) {

        User currentUser = userFacade.getCurrentUser();

        if (currentUser.getCandy() < 50) {
            throw CandyNotEnoughException.EXCEPTION;
        }

        currentUser.minusCandy();

        User user = userRepository.findByNickname(nickname)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        return new GetNameResponse(user);

    }
}
