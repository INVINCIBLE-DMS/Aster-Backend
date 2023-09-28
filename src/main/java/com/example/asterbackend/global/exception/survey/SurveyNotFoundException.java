package com.example.asterbackend.global.exception.survey;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class SurveyNotFoundException extends BusinessException {

    public static final BusinessException EXCEPTION = new SurveyNotFoundException();

    public SurveyNotFoundException() {
        super(ErrorCode.SURVEY_NOT_FOUND);
    }
}
