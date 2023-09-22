package com.example.asterbackend.domain.auth.presentation;

import com.example.asterbackend.domain.auth.presentation.dto.request.SignupRequest;
import com.example.asterbackend.domain.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void signup(@RequestBody @Valid SignupRequest request){
        authService.signup(request);
    }
}
