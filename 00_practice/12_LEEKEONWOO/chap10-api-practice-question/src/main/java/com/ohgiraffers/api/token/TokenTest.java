package com.ohgiraffers.api.token;

public class TokenTest {

    public static void main(String[] args) {
    //1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
        String java = "J a v a P r o g r a m ";
        int javaLength = java.length();

    //2. 토큰 처리전 글자 및 개수 출력
        System.out.println("토큰 처리전 글자 : \"" + java + "\"");
        System.out.println("토큰 처리전 글자 개수 : " + javaLength);


    //3. 토큰 처리 후 문자배열 갯수 출력 확인
        String[] Token = java.split(" ");
        System.out.println("토큰 처리 후 문자배열 갯수 : " + Token.length);

    //4. `char[]` 값 출력, char[] 대입
        char[] carr = new char[Token.length];
        for(int i = 0; i < Token.length; i++){
            carr[i] = Token[i].charAt(0);
            System.out.print(carr[i]);

        }

        System.out.println();
    // char[] 값을 꺼내와서 소문자면 대문자로 바꿔줘서 저장.

        for(int j = 0; j < Token.length; j++){

            if(carr[j] > 96){
                carr[j]= (char) (carr[j]-32);
            }

        }

    //5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
        String javaUppercase = new String(carr);
        System.out.println(javaUppercase);
    }

}
