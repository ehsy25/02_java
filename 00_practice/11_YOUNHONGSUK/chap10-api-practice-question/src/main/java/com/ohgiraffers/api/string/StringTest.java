package com.ohgiraffers.api.string;

public class StringTest {

    public static void main (String[] args){

        StringProcess sp = new StringProcess();


        System.out.println(sp.preChar("hello"));

        int num = sp.charSu("application car cable", 'c');
        System.out.println(num);

    }

}
