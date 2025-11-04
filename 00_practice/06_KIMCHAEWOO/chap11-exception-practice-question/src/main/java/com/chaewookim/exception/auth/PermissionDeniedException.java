package com.chaewookim.exception.auth;

public class PermissionDeniedException extends Exception{
    public PermissionDeniedException(String message) {
        super(message);
    }
}
