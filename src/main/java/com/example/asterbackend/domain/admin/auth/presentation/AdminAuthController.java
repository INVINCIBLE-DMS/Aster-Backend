package com.example.asterbackend.domain.admin.auth.presentation;

import com.example.asterbackend.domain.admin.auth.presentation.dto.request.AdminLoginRequest;
import com.example.asterbackend.domain.admin.auth.service.AdminLoginService;
import com.example.asterbackend.domain.user.auth.presentation.dto.response.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminAuthController {

    private final AdminLoginService adminLoginService;

    @PostMapping()
    public TokenResponse login(AdminLoginRequest adminLoginRequest) {
        return adminLoginService.login(adminLoginRequest);
    }

}
