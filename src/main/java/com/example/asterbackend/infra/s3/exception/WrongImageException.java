package com.example.asterbackend.infra.s3.exception;


import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class WrongImageException extends BusinessException {

    public static final BusinessException EXCEPTION = new WrongImageException();
    private WrongImageException() { super(ErrorCode.WRONG_IMAGE);}
}
