package com.ohgiraffers.exception.charcheck;

public class CharaterProcess {

    public CharaterProcess() {

    }

    public int countAlpha(String s) throws CharCheckException {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c) || Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;

    }
}
