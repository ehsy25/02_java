package com.chaewookim.api.token;

import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        String input = "J a v a P r o g r a m";
        String[] trimInput = input.split(" ");
        char[] cArr = new char[trimInput.length];

        System.out.println("토큰 전: " + input.length());
        System.out.println("토큰 후: " + trimInput.length);

        int count = 0;
        for (String s : trimInput) {
            cArr[count] = s.charAt(0);
            count++;
        }

        System.out.println(cArr);

        String result = "";
        for (char c : cArr) {
            result += String.valueOf(c);
        }

        System.out.println(result.toUpperCase());


    }
}
