package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {

        String ch = "J a v a P r o g r a m ";
        System.out.println(ch);
        System.out.println(ch.length());
        char[] carr = ch.replace(" ", "").toCharArray();
        System.out.println(carr.length);
        System.out.println(Arrays.toString(carr));
        System.out.println(new String(carr));
        System.out.println(new String(carr).toUpperCase());

    }
}
