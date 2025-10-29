package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";
        System.out.println(str);
        System.out.println(str.length());

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

        char[] charArr = new char[st.countTokens()];

        int index = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            charArr[index++] = token.charAt(0);
        }
        System.out.println(Arrays.toString(charArr));

        String word = new String(charArr);
        System.out.println(word);

        System.out.println(word.toUpperCase());

    }
}
