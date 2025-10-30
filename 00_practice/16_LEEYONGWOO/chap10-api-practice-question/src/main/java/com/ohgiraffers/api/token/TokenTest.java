package com.ohgiraffers.api.token;

import java.util.Locale;

public class TokenTest {
    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";
        System.out.println("처리 전 글자 : "+str);
        System.out.println(str.length());

        String[] token = str.split(" ");
        char[] charr=new char[token.length];
        for(int i=0;i<token.length;i++){
            charr[i]=token[i].charAt(0);
        }
        System.out.println("처리 후 글자 수 : "+charr.length);
        for(int i=0;i<charr.length;i++){
            System.out.print(charr[i]+" ");
        }

        String[] strr= new String[token.length];

        for(int i=0; i<charr.length; i++){
            strr[i]=String.valueOf(charr[i]);
        }
        System.out.println();
        for(int i=0;i<strr.length;i++){
            strr[i]=strr[i].substring(0,1).toUpperCase(Locale.ROOT);
            System.out.print(strr[i]+" ");
        }
    }
}
