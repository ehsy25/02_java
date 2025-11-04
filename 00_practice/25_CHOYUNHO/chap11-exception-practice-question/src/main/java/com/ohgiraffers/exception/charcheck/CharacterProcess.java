package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {
    public int coutAlpha(String s) throws CharCheckException {
        int count =0;
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == ' '){
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            };
        }
        for(int i=0;i<c.length;i++){
            if(Character.isLowerCase(c[i])||Character.isUpperCase(c[i])){
                count++;
            }
        }
        return count;
    }
}

