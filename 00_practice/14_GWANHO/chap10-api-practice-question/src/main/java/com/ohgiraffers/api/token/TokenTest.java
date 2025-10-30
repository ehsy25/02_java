package com.ohgiraffers.api.token;

import java.util.StringTokenizer;

/*
- 요구사항
    1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
    2. 토큰 처리전 글자 및 개수 출력
    3. 토큰 처리 후 문자배열 갯수 출력 확인
    4. `char[]` 값 출력
    5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
 */
public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        StringTokenizer st = new StringTokenizer(str, " ");

        int count = 0;
        char[] chars = new char[st.countTokens()];
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            chars[count++] = token.charAt(0);
        }

        StringBuilder builder = new StringBuilder();
        for(char ch : chars){
            builder.append(ch);
        }

        System.out.println(builder.toString().toUpperCase());
    }
}
