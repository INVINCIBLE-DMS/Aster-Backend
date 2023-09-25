package com.example.asterbackend.domain.auth.presentation;

import com.example.asterbackend.domain.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.auth.presentation.dto.response.MyInfoResponse;
import com.example.asterbackend.domain.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.auth.service.MyInfoService;
import com.example.asterbackend.domain.auth.service.SignupService;
import com.example.asterbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final SignupService signupService;
    private final MyInfoService myInfoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TokenResponse signup(@RequestBody @Valid SignupRequest request) {
        return signupService.signup(request);
    }

    @GetMapping("/myInfo")
    public MyInfoResponse getMyInfo() {
        return myInfoService.getMyInfo();
    }


}
