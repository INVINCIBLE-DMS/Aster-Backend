package com.example.asterbackend.domain.student.presentation;

import com.example.asterbackend.domain.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void studentName() {
        studentService.studentName();
    }

}