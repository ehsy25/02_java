package com.lhw.section02.userexception.exception;

public class MoneyNegativeException extends NegativeException {
    // 부모에 매개변수 생성자가 있으니 반드시 아래 매개변수 생성자가
    // 만들어져야 한다.
    public MoneyNegativeException(String message) {
        super(message);
    }
}
