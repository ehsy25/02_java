package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch(op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
            case 'x':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
            /* case에서 일치 값을 찾지 못할 경우 수행할 구문 작성 가능 */
            default:
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improveSwitchStatement() {

        /* java 14부터 적용된 switch문 사용에 대한 흐름 */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        /*
        * 2개 이상의 명령문을 작성해야 하는 경우 {}을 생략하지 못하고 작성해야함
        * 반환값을 yield라는 명령문을 작성하여 명시적으로 리턴
        *  */

        int result =  switch(op) {
            case '+' -> {
                System.out.println("더하기 연산 결과");
                yield first + second;
            }
            case '-' -> {
                System.out.println("빼기 연산 결과");
                yield first - second;
            }
            case '*', 'x' -> {
                System.out.println("곱하기 연산 결과");
                yield first * second;
            }
            case '/' -> {
                System.out.println("나누기(몫) 연산 결과");
                yield first / second;
            }
            case '%' -> {
                System.out.println("나누기(나머지) 연산 결과");
                yield first % second;
            }
            default -> 0;
        };

        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
