package com.ohgiraffers.exception.string;

public class StringValidator {

    public boolean isValidLength(String s) throws StringLengthException {
        int length = s.length();
        // 문자열의 길이는 5자 이상, 10자 이하
        if (length < 5 || length > 10) {
            throw new StringLengthException("문자열의 길이는 5자 이상, 10자 이하이어야 합니다. (현재 길이: " + length + ")");
        }
        return true;
    }
}
