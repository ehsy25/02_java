package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        String s = "J a v a P r o g r a m ";
        System.out.println("토큰 처리전 글자 : " + s);
        System.out.println("토큰 처리전 개수 : " + s.length());

        StringTokenizer st = new StringTokenizer(s, " ");
//        st.countTokens()
        char[] chars =  new char[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++) {
            chars[i] = st.nextToken().charAt(0);
        }
        System.out.println("토큰 처리후 문자배열 개수 : " + chars.length);
        System.out.println(Arrays.toString(chars));
        System.out.println(chars);
        String result = new String(chars);
        System.out.println(result.toUpperCase());





    }
}
