package com.ohgiraffers.exception.string;

public class StringValidator {

    public boolean isValidLength(String str) throws StringLengthException {
        if ( (str.length() <5) || (str.length() > 10) ) {
            throw new StringLengthException("문자열의 길이는 5자 이상, 10자 이하이어야 합니다. (현재 길이: "
            + str.length() + ")");
        }
        return true;
    }
}
