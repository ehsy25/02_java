package com.ohgiraffers.api.string;

import java.util.StringTokenizer;

public class StringProcess {

    public String preChar(String s){


        String left = s.substring((1));
        String start = s.charAt(0) + "";
            start = start.toUpperCase();
        return start + left;
    }

    public int charSu(String s, char ch){

        int count = 0;

        for (int i =0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }

        return count;
    }
}
