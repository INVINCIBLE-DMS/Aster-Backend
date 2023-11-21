package com.example.asterbackend.domain.user.schoolClass.repository;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {
    Optional<SchoolClass> findSchoolClassByGradeAndClassNumber(Long grade, Long classNumber);
}
