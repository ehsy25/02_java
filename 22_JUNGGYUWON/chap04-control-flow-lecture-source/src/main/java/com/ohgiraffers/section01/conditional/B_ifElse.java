package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num > 0){

            if(num % 2 == 0) {
                System.out.println("짝수 입니다.");
            } else {
                System.out.println("홀수 입니다.");
            }
        } else {

            System.out.println("입력하신 숫자는 음수입니다. 양수를 입력해줘");
        }

    }
}
