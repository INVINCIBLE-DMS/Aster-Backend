package com.example.asterbackend.domain.user.repository;

import com.example.asterbackend.domain.user.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {
}
