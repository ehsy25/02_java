package com.ohgiraffers.api.string;

import java.util.Arrays;

public class StringProcess {

    public String preChar(String s){
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);
        return result;
    }

    //문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드
    public int charSu(String s, char ch){
        String [] arr = s.split("");
        int cnt = 0;
        for(String str: arr){
            char st = str.charAt(0);
            if(st == ch){
                cnt++;
            }
        }
        return cnt ;
    }

}
