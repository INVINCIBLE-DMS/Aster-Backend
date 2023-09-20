package com.example.asterbackend.global.exception.user;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class UserExistsException extends BusinessException {

    public static final BusinessException EXCEPTION = new UserExistsException();

    private UserExistsException() {
        super(ErrorCode.USER_EXISTS);
    }

}
