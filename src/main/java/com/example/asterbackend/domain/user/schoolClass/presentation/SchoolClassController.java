package com.example.asterbackend.domain.user.schoolClass.presentation;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.service.CreateClassService;
import com.example.asterbackend.domain.user.schoolClass.service.GetRankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school-class")
public class SchoolClassController {

    private final CreateClassService createClassService;

    private final GetRankService getRankService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createAllClass() {
        createClassService.createAllClass();
    }
    
    @GetMapping()
    public List<SchoolClass> getRank() {
        return getRankService.getRank();
    }
}
