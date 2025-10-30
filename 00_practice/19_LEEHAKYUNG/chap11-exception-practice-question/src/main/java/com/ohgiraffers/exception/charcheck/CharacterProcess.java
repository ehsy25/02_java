package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {}

    public int countAlpha(String str) throws CharCheckException {

        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isWhitespace(str.charAt(i))){
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }
            if (Character.isUpperCase(str.charAt(i)) || Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
