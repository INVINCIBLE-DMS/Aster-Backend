package com.example.asterbackend.global.exception.user;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class WriterMismatchException extends BusinessException {

    public static final BusinessException EXCEPTION = new WriterMismatchException();

    public WriterMismatchException() {
        super(ErrorCode.WRITER_MISMATCH);
    }

}
