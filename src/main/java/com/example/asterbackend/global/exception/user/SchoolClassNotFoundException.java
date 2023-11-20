package com.example.asterbackend.global.exception.user;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class SchoolClassNotFoundException extends BusinessException {

    public static final BusinessException EXCEPTION = new SchoolClassNotFoundException();

    public SchoolClassNotFoundException() {
        super(ErrorCode.SCHOOL_CLASS_NOT_FOUND);
    }

}