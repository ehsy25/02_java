package com.rlatjddms.api.token;

import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";

        System.out.println("======= 토큰 처리 전 =======");
        System.out.println("글자 : " + str);
        System.out.println("글자 개수 : " + str.length());

        System.out.println("======= 토큰 처리 후 =======");
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println("문자배열 개수 : " + st.countTokens());
        char[] tokens = new char[st.countTokens()];
        int i = 0;

        while (st.hasMoreTokens()) {
            tokens[i] = st.nextToken().charAt(0);
            i++;
        }
        String result = new String(tokens);

        System.out.println("문자배열 값 : " + result);
        System.out.println("대문자 변환 : " + result.toUpperCase());
    }
}
