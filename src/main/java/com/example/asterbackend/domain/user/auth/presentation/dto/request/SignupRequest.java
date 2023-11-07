package com.example.asterbackend.domain.user.auth.presentation.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SignupRequest {

    @NotBlank
    @Size(min = 2, max = 4,message = "username은 2글자 이상, 4글자 이하여야 합니다.")
    private String username;

    @NotBlank
    @Size(min = 4, max = 4,message = "studentId은 4글자여야 합니다.")
    private String studentId;

    private String profileImgUrl;

}
