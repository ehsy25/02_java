package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokentest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(str.length());
        char[] c = new char[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()){
            c[count++] = st.nextToken().charAt(0);
        }
        System.out.println(c.length);
        System.out.println(Arrays.toString(c));
        String strr = "";
        for(int i=0;i<c.length;i++){
            strr = strr+(c[i]+"");
        }
        System.out.println(strr.toUpperCase());


    }
}
