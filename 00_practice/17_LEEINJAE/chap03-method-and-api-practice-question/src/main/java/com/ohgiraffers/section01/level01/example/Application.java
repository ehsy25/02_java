package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int input = sc.nextInt();

        ExampleTest ex = new ExampleTest();
        ex.evenOdd(input);

        System.out.println("------------------------------");

        System.out.print("첫 번째 정수 입력 :");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력 :");
        int num2 = sc.nextInt();

        System.out.println("------------------------------");
        ex.randomMathQuiz();
    }
}
