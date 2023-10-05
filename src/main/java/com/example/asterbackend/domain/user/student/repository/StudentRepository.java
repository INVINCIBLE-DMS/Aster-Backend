package com.example.asterbackend.domain.user.student.repository;

import com.example.asterbackend.domain.user.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByUsername(String username);

    void deleteByUsername(String username);
}