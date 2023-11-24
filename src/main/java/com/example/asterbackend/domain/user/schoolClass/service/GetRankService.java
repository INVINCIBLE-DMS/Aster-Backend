package com.example.asterbackend.domain.user.schoolClass.service;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.repository.CustomSchoolClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetRankService {

    private final CustomSchoolClassRepository customSchoolClassRepository;

    public List<SchoolClass> getRank() {
        return customSchoolClassRepository.getRank();
    }
}
