package com.example.asterbackend.domain.admin.auth.presentation.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LoginAdminRequest {
    @NotNull
    private String username;
    @NotNull
    private String secretKey;
}
