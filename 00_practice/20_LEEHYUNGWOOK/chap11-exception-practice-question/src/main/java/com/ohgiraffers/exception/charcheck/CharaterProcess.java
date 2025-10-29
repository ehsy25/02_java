package com.ohgiraffers.exception.charcheck;

public class CharaterProcess {

    public CharaterProcess() {}

    public int countAlpha(String s) throws CharCheckException{

        int abcCount=0;
        for ( char c : s.toCharArray() ) {
            if ( c >= 65 && c <=90 || c >= 97 && c <=122) {
                abcCount++;
            } else if ( c == ' ') {
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }
        }
        return abcCount;
    }

}
