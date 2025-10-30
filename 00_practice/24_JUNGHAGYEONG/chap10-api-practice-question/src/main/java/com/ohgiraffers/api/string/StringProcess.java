package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        String str = s.substring(0,1).toUpperCase() + s.substring(1);
        return str;
    }

    public int charSu(String s, char ch) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                num++;
            }
        }
        return num;
    }
}
