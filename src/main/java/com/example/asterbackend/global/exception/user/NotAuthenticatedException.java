package com.example.asterbackend.global.exception.user;

public class NotAuthenticatedException extends RuntimeException{

    public NotAuthenticatedException(String message) {
        super(message);
    }
}
