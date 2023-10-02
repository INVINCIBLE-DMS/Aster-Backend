package com.example.asterbackend.domain.admin.auth.presentation.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdminLoginRequest {
    private String username;

    private String secretKey;
}
