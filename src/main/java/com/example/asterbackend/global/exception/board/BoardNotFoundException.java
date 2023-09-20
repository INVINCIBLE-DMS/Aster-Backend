package com.example.asterbackend.global.exception.board;


import com.example.asterbackend.global.error.exception.BusinessException;
import com.example.asterbackend.global.error.exception.ErrorCode;

public class BoardNotFoundException extends BusinessException {

    public static final BusinessException EXCEPTION = new BoardNotFoundException();

    public BoardNotFoundException() {
        super(ErrorCode.BOARD_NOT_FOUND);
    }

}
