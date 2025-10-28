package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

/*    1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
2. 토큰 처리전 글자 및 개수 출력
3. 토큰 처리 후 문자배열 갯수 출력 확인
4. `char[]` 값 출력
5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력*/

    public void convert(String s){


        StringTokenizer st  = new StringTokenizer(s, " ");
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

        String str = "";
        for(int j = 0; j < ca.length; j++){
            str += ca[j];
        }
        str = str.toUpperCase();
        System.out.println(str);
    }

}
