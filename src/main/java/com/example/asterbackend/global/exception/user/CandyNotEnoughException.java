package com.example.asterbackend.global.exception.user;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class CandyNotEnoughException extends BusinessException {

    public static final BusinessException EXCEPTION = new CandyNotEnoughException();

    public CandyNotEnoughException() {
        super(ErrorCode.CANDY_NOT_ENOUGH);
    }

}
