package com.example.asterbackend.domain.user.auth.presentation;

import com.example.asterbackend.domain.user.auth.presentation.dto.request.LoginRequest;
import com.example.asterbackend.domain.user.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import com.example.asterbackend.domain.user.auth.service.LoginService;
import com.example.asterbackend.domain.user.auth.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/aster/auth")
@RequiredArgsConstructor
public class AuthController {

    private final SignupService signupService;

    private final LoginService loginService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TokenResponse signup(@RequestBody @Valid SignupRequest request) {
        return signupService.signup(request);
    }

    @PostMapping("/login")
    public TokenResponse login(@RequestBody @Valid LoginRequest request) {
        return loginService.login(request);
    }

}
