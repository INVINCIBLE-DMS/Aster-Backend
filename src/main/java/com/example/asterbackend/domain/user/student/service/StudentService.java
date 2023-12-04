package com.example.asterbackend.domain.user.student.service;

import com.example.asterbackend.domain.user.student.entity.Student;
import com.example.asterbackend.domain.user.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void studentName() {

        studentRepository.deleteAll(); // 이전의 모든 유저 정보 삭제

        List<Student> studentList = new ArrayList<>();

        studentRepository.saveAll(studentList);

    }
}