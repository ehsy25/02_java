package com.ohgiraffers.exception.auth;

public class PermissionDeniedException extends Exception{
    PermissionDeniedException(String message){
        super(message);
    }
}
