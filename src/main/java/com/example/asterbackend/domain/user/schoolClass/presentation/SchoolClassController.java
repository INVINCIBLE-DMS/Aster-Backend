package com.example.asterbackend.domain.user.schoolClass.presentation;

import com.example.asterbackend.domain.user.schoolClass.service.CreateClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school-class")
public class SchoolClassController {

    private final CreateClassService createClassService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createAllClass() {
        createClassService.createAllClass();
    }
}
