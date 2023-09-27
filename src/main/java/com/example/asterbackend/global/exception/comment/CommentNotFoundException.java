package com.example.asterbackend.global.exception.comment;

import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class CommentNotFoundException extends BusinessException {

    public static final BusinessException EXCEPTION = new com.example.asterbackend.global.exception.feed.FeedNotFoundException();

    public CommentNotFoundException() {
        super(ErrorCode.COMMENT_NOT_FOUND);
    }

}