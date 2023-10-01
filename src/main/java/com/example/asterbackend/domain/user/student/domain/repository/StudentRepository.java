package com.example.asterbackend.domain.user.student.domain.repository;

import com.example.asterbackend.domain.user.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}