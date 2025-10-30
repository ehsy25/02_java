package com.ohgiraffers.api.string;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        StringProcess sp = new StringProcess();
        String result=sp.prechar("hello world");
        System.out.println(result);

        int num=sp.charSu("application car cable", 'c');
        System.out.println(num);

    }
}
