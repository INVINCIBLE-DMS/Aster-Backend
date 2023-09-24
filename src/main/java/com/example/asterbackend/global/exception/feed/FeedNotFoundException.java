package com.example.asterbackend.global.exception.feed;


import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class FeedNotFoundException extends BusinessException {

    public static final BusinessException EXCEPTION = new FeedNotFoundException();

    public FeedNotFoundException() {
        super(ErrorCode.Feed_NOT_FOUND);
    }

}
