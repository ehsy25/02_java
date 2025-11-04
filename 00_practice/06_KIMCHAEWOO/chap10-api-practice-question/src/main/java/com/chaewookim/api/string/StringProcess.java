package com.chaewookim.api.string;

import java.util.StringTokenizer;

public class StringProcess {

    public String preChar(String s) {
        String first = s.substring(0,1);
        first = first.toUpperCase();
        String result = first.concat(s.substring(1,s.length()));

        return result;
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
