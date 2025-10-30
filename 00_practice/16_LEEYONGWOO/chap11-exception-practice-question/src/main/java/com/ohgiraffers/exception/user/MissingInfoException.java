package com.ohgiraffers.exception.user;

public class MissingInfoException extends RuntimeException {
    public MissingInfoException(String message) {
        super(message);
    }
}
