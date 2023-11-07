package com.example.asterbackend.domain.user.student.repository;

import com.example.asterbackend.domain.user.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentId(String studentId);

    void deleteByStudentId(String studentId);
}