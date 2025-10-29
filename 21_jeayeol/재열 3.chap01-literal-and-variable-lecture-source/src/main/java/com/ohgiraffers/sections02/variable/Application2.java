package com.ohgiraffers.sections02.variable;

public class Application2 {
    public static void main(String[] args) {

        //1. 정수를 취급하는 자료형
        // 변수를 선언
        byte bnum; //1byte 8bit
        short snum; // 2byte 16 bit
        int inum; // 3byte 24 bit
        long lnum; // 4byte 32bit

        // 2. 실수를 취급하는 자료형
        float fNum; //4byte
        double dNum;

        // 3. 문자를 취급하는 자료형
        char ch; // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue; // 1byte is가 변수 앞에 붙으면 거의 불런(boolean) 값의 형식으로 불러냄

        // 5. 문자열을 취급하는 자료형 (참조 자료형)
        String str; // 4byte 를 할당

        // 자료형 별로 초기화를하는 것 . 위 자료형을 초기화 하고 값 넣는것임
        bnum = 1 ;
        snum = 2 ;
        inum = 3;
        lnum = 2200000000L;  // long형에 대입되는 값은 L 을 붙인다.

        fNum = 3.14f; // double 형으로 인식되는 실수를 float에 담을땐 값 뒤에 f 붙임
        dNum = -3.14;

        ch = 'a';
        ch = 97; //chat 는 양수만 가능
        isTrue = true;

        int kor = 90;
        int math = 80;
        int eng = 88;

        int sum = kor + math + eng;
        System.out.println("sum="+ sum);

        System.out.println(sum/3);

        double  avg = sum / 3.0 ; //  나눗셈은  일반적으로 실수가 나옴 .
        System.out.println("avg="+ avg);






    }
}
