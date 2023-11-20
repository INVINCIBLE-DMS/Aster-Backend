package com.example.asterbackend.domain.user.schoolClass.facade;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.repository.SchoolClassRepository;
import com.example.asterbackend.global.exception.feed.FeedNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchoolClassFacade {

    private final SchoolClassRepository schoolClassRepository;

    public SchoolClass currentSchoolClass(Long SchoolClassId) {
        return schoolClassRepository.findById(SchoolClassId)
                .orElseThrow(()-> FeedNotFoundException.EXCEPTION);
    }

}
