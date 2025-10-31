package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s) throws CharCheckException {
        if (s == null || s.isEmpty()) {
            throw new CharCheckException("입력값이 null이거나 비어있습니다.");
        }
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
            }

            if (Character.isAlphabetic(ch)) {
                count++;
            }
        }
        return count;
    }
}

