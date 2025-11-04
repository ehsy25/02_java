package com.ohgiraffers.api.token;

import java.util.Arrays;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";

        int before_length = str.length();
        System.out.println("토큰 처리 전 문자열: " + str);
        System.out.println("토큰 처리 전 개수 : " + before_length);

        String[] strArr = str.split(" ");
        // 토큰 처리 후 글자 및 개수 출력 확인
        System.out.println(Arrays.toString(strArr));

        char[] tokenized = new char[str.length()/2];
        for (int i = 0; i < tokenized.length; i++) {
            tokenized[i] = strArr[i].charAt(0);
            System.out.print(tokenized[i]);
        }
        System.out.println();

        //char[] 다시 string으로 변환
        String backToString = "";

        for  (int i = 0; i < tokenized.length; i++) {
            backToString += tokenized[i];
        }
        System.out.println(backToString.toUpperCase());

    }

}
