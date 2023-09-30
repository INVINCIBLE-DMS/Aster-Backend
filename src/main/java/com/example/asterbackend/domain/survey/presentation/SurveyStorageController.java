package com.example.asterbackend.domain.survey.presentation;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.survey.service.QueryNewSurveyService;
import com.example.asterbackend.domain.survey.service.SaveSurveyStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey-storage")
public class SurveyStorageController {

    private final SaveSurveyStorageService saveSurveyStorageService;

    private final QueryNewSurveyService queryNewSurveyService;

    @PostMapping()
    public void saveSurveyStorage(@RequestBody @Valid SurveyRequest request) {
        saveSurveyStorageService.saveSurveyStorage(request);
    }

    @GetMapping("/new")
    public List<SurveyStorage> queryNewSurvey() {
        return queryNewSurveyService.queryNewSurvey();
    }

}
