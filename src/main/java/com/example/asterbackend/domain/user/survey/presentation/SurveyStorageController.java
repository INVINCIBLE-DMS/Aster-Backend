package com.example.asterbackend.domain.user.survey.presentation;

import com.example.asterbackend.domain.admin.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.AnswerSurveyRequest;
import com.example.asterbackend.domain.user.survey.presentation.dto.request.SurveyRequest;
import com.example.asterbackend.domain.user.survey.service.AnswerSurveyService;
import com.example.asterbackend.domain.user.survey.service.QueryNewSurveyService;
import com.example.asterbackend.domain.admin.survey.service.SaveSurveyStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/survey-storage")
public class SurveyStorageController {

    private final SaveSurveyStorageService saveSurveyStorageService;

    private final QueryNewSurveyService queryNewSurveyService;

    private final AnswerSurveyService answerSurveyService;

    @PostMapping()
    public void saveSurveyStorage(@RequestBody @Valid SurveyRequest request) {
            saveSurveyStorageService.saveImageSurveyStorage(request);
    }

    @GetMapping()
    public List<SurveyStorage> queryNewSurvey() {
        return queryNewSurveyService.queryNewSurvey();
    }

    @PutMapping()
    public void answerSurvey(@RequestBody @Valid AnswerSurveyRequest request) {
        answerSurveyService.answerSurvey(request);
    }

}
