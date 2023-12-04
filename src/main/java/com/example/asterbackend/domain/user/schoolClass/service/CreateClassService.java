package com.example.asterbackend.domain.user.schoolClass.service;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.repository.SchoolClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CreateClassService {

    private final SchoolClassRepository schoolClassRepository;

    public void createAllClass() {
        List<SchoolClass> schoolClassList = new ArrayList<>();

        //1학년
        schoolClassList.add(new SchoolClass(1L, 1L, 0));
        schoolClassList.add(new SchoolClass(1L, 2L, 0));
        schoolClassList.add(new SchoolClass(1L, 3L, 0));
        schoolClassList.add(new SchoolClass(1L, 4L, 0));

        //2학년
        schoolClassList.add(new SchoolClass(2L, 1L, 0));
        schoolClassList.add(new SchoolClass(2L, 2L, 0));
        schoolClassList.add(new SchoolClass(2L, 3L, 0));
        schoolClassList.add(new SchoolClass(2L, 4L, 0));

        //3학년
        schoolClassList.add(new SchoolClass(3L, 1L, 0));
        schoolClassList.add(new SchoolClass(3L, 2L, 0));
        schoolClassList.add(new SchoolClass(3L, 3L, 0));
        schoolClassList.add(new SchoolClass(3L, 4L, 0));

        schoolClassRepository.saveAll(schoolClassList);
    }
    
}
