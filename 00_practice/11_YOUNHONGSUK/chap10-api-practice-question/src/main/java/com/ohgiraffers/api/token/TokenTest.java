package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

    public void convert(String s){

        //주어진 글자에서 띄어쓰기 제거
        StringTokenizer st  = new StringTokenizer(s, " ");

        //토큰을 배열로 옮기기
        char[] ca = new char[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens()){
            ca[i] =  st.nextToken().charAt(0);
            i++;
        }

        System.out.println(ca);
        System.out.println("처리 전 길이: " + s.length());
        System.out.println("처리 후 길이: " + st.countTokens());
        System.out.println(Arrays.toString(ca));

        //배열에서 한 글자씩 빼서 비어있는 스트링에 더하기
        String str = "";
        for(int j = 0; j < ca.length; j++){
            str += ca[j];
        }
        str = str.toUpperCase();
        System.out.println(str);
    }

}
