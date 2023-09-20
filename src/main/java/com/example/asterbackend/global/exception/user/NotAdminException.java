package com.example.asterbackend.global.exception.user;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class NotAdminException extends BusinessException {

    public static final BusinessException EXCEPTION = new NotAdminException();

    public NotAdminException() {
        super(ErrorCode.NOT_ADMIN);
    }

}
