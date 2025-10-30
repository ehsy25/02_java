package com.ohgiraffers.api.string;

public class StringProcess {
    public StringProcess() {}

    public String preChar(String s) {
        String first = s.toUpperCase().substring(0, 1);
        String rest = s.substring(1);
        return first + rest;
    }
    public int charSu(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
