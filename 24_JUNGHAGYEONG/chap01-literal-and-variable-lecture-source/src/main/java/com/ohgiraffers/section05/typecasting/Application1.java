package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {
        // 정수 : byte < short < int* < long
        // 실수 : float < double*
        // 문자 : char
        // 논리 : boolean

        byte bNum = 1;
        short sNum = bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20L;

        long result = num1 + num2; // long으로 바뀜
        System.out.println("result = " + result);

        // char < int
        int ch1 = 'a';
        System.out.println("ca1 = " + ch1); // 문자형은 int형으로 자동형변환 가능

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
    }
}
