package com.example.asterbackend.domain.user.user.repository;

import com.example.asterbackend.domain.user.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByStudentId(String studentId);

    Optional<User> findByUsername(String username);
}
