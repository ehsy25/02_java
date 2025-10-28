package com.ohgiraffers.api.string;

public class StringProcess {

    // 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    public String preChar(String s) {
        return (s.substring(0,1)).toUpperCase()+s.substring(1);
    }

    // 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
    public int charSu(String s, char ch) {
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==ch) {
                count++;
            }
        }
        return count;
    }

}
