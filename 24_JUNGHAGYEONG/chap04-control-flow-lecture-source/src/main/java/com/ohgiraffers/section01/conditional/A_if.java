package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testsimpleIfStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력 한 숫자는 짝수");
        }

        System.out.println("프로그램 종료");
    }

    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num > 0) { // 짝수 인지 홀수 인지 확인 전 양수/음수 판단
            if (num % 2 == 0) {
                System.out.println("입력 한 숫자는 짝수");
            }
        }

        System.out.println("프로그램 종료");
    }
}
