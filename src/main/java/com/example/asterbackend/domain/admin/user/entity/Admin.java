package com.example.asterbackend.domain.admin.user.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin {
    @Id
    private String username;

    @Value("${key.secretKey}")
    private String secretKey;
}
