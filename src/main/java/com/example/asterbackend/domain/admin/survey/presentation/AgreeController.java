package com.example.asterbackend.domain.admin.survey.presentation;

import com.example.asterbackend.domain.admin.survey.service.AddAgreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agree")
public class AgreeController {
    private final AddAgreeService addAgreeService;
    @PostMapping("/{surveyId}")
    public void addAgree(@PathVariable Long surveyId) {
        addAgreeService.addAgree(surveyId);
    }
}
