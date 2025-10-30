package com.ohgiraffers.api.token;

import java.util.Locale;
import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";
        int count = 0;
        int countIncludeSpace = 0;
        int index = 0;
        char[] charArray = new char[str.length()];
        String afterToken = "";

        System.out.print("토큰 처리 전 글자 : ");
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            countIncludeSpace++;
            if(str.charAt(i) > 'A' && str.charAt(i) < 'z'){
                count++;
            }
        }
        System.out.println();
        System.out.println("토큰 처리 전 글자 개수(공백 포함) : " + countIncludeSpace);
        System.out.println("토큰 처리 전 글자 개수 : " + count);


        System.out.print("토큰 처리 후 글자 : ");
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            charArray[index] = st.nextToken().charAt(0);
            System.out.print(charArray[index]);
            index++;
        }


        System.out.println();
        System.out.println("토큰 처리 후 글자 개수 : " + index);

        for(int i = 0; i < index; i++){
            afterToken += charArray[i];
        }

        System.out.println("토큰 처리 후 글자 : " + afterToken.toUpperCase(Locale.ROOT));
    }
}
