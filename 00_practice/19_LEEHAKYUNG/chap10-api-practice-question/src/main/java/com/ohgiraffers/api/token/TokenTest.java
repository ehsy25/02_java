package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        String target = "J a v a P r o g r a m ";
        System.out.println("토큰처리전 글자 : " + target);
        System.out.println("토큰처리전 개수 : " + target.length());
        StringTokenizer tk = new StringTokenizer(target);
        String[] tokens = target.split(" ");
        char[] letters = new char[tokens.length];
        int cnt = 0;
        while (tk.hasMoreTokens()) {
            char ch = tk.nextToken().charAt(0);
            letters[cnt] = ch;
            cnt++;
        }
        System.out.println("토큰처리후 문자배열 갯수 : " + letters.length);

        System.out.println("== char[] 값 출력 ==");
        System.out.println(Arrays.toString(letters));

        System.out.println("== String으로 변환 후 대문자로 변환하여 출력 ==");

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].toUpperCase();
        }
        System.out.println(Arrays.toString(tokens));

    }
}
