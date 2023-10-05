package com.example.asterbackend.global.exception.user;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class NotStudentException extends BusinessException {

    public static final BusinessException EXCEPTION = new NotStudentException();

    public NotStudentException() {
        super(ErrorCode.NOT_STUDENT);
    }

}

