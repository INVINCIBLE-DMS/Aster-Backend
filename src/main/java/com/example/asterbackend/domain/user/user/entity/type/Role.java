package com.example.asterbackend.domain.user.user.entity.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GENERAL("USER"),
    ADMIN("ADMIN");

    private final String name;

}
