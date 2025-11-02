package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        String upperS = s.substring(0, 1).toUpperCase() + s.substring(1);
        return upperS;
    }

    public int charSu(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
