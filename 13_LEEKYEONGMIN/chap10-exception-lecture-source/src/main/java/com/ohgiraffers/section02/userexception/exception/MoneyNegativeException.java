package com.ohgiraffers.section02.userexception.exception;

public class MoneyNegativeException extends NegativeException {
    public MoneyNegativeException(String message) {
        super(message);
    }
}
//감싸고 싶은 부분 드래그한 다음 Alt+ctrl+t하면 자동생성