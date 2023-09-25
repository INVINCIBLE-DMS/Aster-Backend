package com.example.asterbackend.domain.auth.presentation.dto.request;

import com.example.asterbackend.domain.user.entity.type.Part;
import com.example.asterbackend.domain.user.entity.type.Sex;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SignupRequest {

    @NotBlank
    @Size(min = 2, max = 4,message = "username은 2글자 이상, 4글자 이하여야 합니다.")
    private String username;

    @NotBlank
    @Size(min = 1, max = 15, message = "nickname은 1글자 이상, 15글자 이하여야 합니다.")
    private String nickname;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Part part;
}
