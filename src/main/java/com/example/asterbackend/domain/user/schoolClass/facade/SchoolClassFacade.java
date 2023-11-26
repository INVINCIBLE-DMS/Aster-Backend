package com.example.asterbackend.domain.user.schoolClass.facade;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.repository.SchoolClassRepository;
import com.example.asterbackend.global.exception.user.SchoolClassNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchoolClassFacade {

    private final SchoolClassRepository schoolClassRepository;

    public SchoolClass currentSchoolClass(Long grade, Long classNumber) {
        return schoolClassRepository.findSchoolClassByGradeAndClassNumber(grade, classNumber)
                .orElseThrow(()-> SchoolClassNotFoundException.EXCEPTION);
    }
}
