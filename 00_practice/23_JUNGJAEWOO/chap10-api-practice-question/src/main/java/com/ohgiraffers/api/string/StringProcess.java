package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String s) {
        return (s.substring(0,1)).toUpperCase()+s.substring(1);
    }
    public int charSu(String s, char ch) {
        return s.split(String.valueOf(ch),-1).length - 1;
    }
}
