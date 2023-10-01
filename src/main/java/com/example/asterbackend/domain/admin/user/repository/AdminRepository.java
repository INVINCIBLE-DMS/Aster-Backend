package com.example.asterbackend.domain.admin.user.repository;

import com.example.asterbackend.domain.admin.user.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {
}
