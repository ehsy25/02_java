package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    public void test() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int num2 = sc.nextInt();

        NumberProcess np = new NumberProcess();

        try {
            boolean b = np.checkDouble(num1, num2);

            if (b) {
                System.out.println(num1 + "는 " + num2 + "의 배수입니다.");
            } else {
                System.out.println(num1 + "는 " + num2 + "의 배수가 아닙니다.");
            }
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void main(String[] args) {
        new Run().test();
    }
}
