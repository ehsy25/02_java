package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        //문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
        String result = "";
        char firstLetter = s.charAt(0);

        /*소문자이면 앞 글자를 대문자로 바꾸어준다.*/
        if (firstLetter >= 97 || firstLetter <= 122) {
            char bigLetter = (char) (firstLetter - 32);
            result = bigLetter + s.substring(1);
        } else {
            /*대문자이면 종료시킵니다.*/
            System.out.println("첫 글자가 소문자가 아닙니다.");
            System.exit(0);
        }
        return result;
    }

    public int charSu(String s, char ch) { //문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
        int count = 0;
        for (char searchChar : s.toCharArray()) {
            if (searchChar == ch) {
                count++;
            }
        }
        return count;
    }

}
