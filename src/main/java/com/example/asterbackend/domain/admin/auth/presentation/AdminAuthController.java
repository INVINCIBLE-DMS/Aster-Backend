package com.example.asterbackend.domain.admin.auth.presentation;

import com.example.asterbackend.domain.admin.auth.presentation.dto.request.LoginAdminRequest;
import com.example.asterbackend.domain.admin.auth.service.LoginAdminService;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminAuthController {
    private final LoginAdminService loginAdminService;

    @PostMapping()
    public TokenResponse login(@RequestBody @Valid LoginAdminRequest request) {
        return loginAdminService.login(request);
    }
}
