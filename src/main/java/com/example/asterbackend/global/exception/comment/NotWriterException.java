package com.example.asterbackend.global.exception.comment;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class NotWriterException extends BusinessException {

    public static final BusinessException EXCEPTION = new NotWriterException();

    public NotWriterException() {
        super(ErrorCode.NOT_WRITER);
    }

}