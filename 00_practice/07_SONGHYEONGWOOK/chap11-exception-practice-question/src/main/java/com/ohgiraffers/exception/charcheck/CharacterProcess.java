package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s) throws CharCheckException {
        String upper = s.toUpperCase();
        int count = 0;


//        for (int i = 0; i < upper.length(); i++) {
//            if (upper.charAt(i) >= 'A' || upper.charAt(i) <= 'Z') {
//                count++;
//            } else if(upper.charAt(i) == ' ') {
//                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
//            }
//        }

        for (int i = 0; i < upper.length(); i++) {
            if (upper.charAt(i) == ' ') {
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            } else if(upper.charAt(i) >= 'A' || upper.charAt(i) <= 'Z') {
                count++;
            }
        }

        return count;
    }
}
