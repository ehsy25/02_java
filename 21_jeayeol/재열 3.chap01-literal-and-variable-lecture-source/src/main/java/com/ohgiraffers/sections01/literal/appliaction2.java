package com.ohgiraffers.sections01.literal;

public class appliaction2 {
    public static void main(String[] args) {
    // 정수와 정수의 연산
        System.out.println("====================정수와 정수의 연산================");
        System.out.println(123+456);
        //컨트롤 + D 복사
        System.out.println(123+456);
        System.out.println(123*10);
        System.out.println(123%10); // 나누기를 한 몫의 값
        System.out.println(123/10); // 나누기를 한 몫의 값

        System.out.println("================실수와의 실수 연산================");
        System.out.println(1.23+1.23);
        System.out.println(1.23-1.23);
        System.out.println(1.23*1.23);
        System.out.println(1.24%3.0); // 약간의 오차가 생김

        //언제나 정수와 실수의 연산의 결과는 항상 실수가 나옴
        System.out.println("==============정수와 실수의 연산 =================");
        System.out.println(123+0.5);
        System.out.println(123-5);
        System.out.println(123*0.5);
        System.out.println(123%0.5);

        //문자의 연산 문자는 정수형태로 넘어감
        System.out.println("====== 문자와 문자의 연산======");
        System.out.println('a'+'b');
        System.out.println('a'-'b'); // -1 이 나옴 아스키 코드 기준값으로 더하거나 뺌
        System.out.println('a'*'b');

        System.out.println("hello + 123.456");
        System.out.println("hello" + "a");
        System.out.println("hello" + "ture");

        // 논리연산은 모든 사칙연산 불가
        // 논리값과 문자열의 + 연산만 사용 가능

        System.out.println("123"+"456"); // 이어붙이기
        System.out.println(123+456); // 연산
        System.out.println("123"+456); // 문자열123에 456 더한것임  123456
        System.out.println("123"+(456+113)); // 문자열123에 456 더한것임  123456
        System.out.println("123"+456+113); // 문자열 123456 으로 처리되어서 123456 에 113 붙인것임

        System.out.println("============================================");
        System.out.println("9"+(1+1));
        System.out.println(""+1+1); // 공백도  문자열 처리
        System.out.println("더하기의 결과는"+(11+32));
        System.out.println((113*123)+" : 값이 너무 큽니다");




    }
}
