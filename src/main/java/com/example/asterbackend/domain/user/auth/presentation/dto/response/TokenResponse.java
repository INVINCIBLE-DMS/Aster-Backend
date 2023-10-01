package com.example.asterbackend.domain.user.auth.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TokenResponse {
    String accessToken;
}
