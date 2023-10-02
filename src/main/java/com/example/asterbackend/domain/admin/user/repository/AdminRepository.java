package com.example.asterbackend.domain.admin.user.repository;


import com.example.asterbackend.domain.admin.auth.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, String> {
    Optional<Admin> findByUsername(String username);
}
