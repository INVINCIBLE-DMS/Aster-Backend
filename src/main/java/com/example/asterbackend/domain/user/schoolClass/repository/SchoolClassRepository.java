package com.example.asterbackend.domain.user.schoolClass.repository;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {
}
