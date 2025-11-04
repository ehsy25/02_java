package com.ohgiraffers.sectoin04.comparison;

public class Application1 {
    public static void main(String[] args) {

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));

        int x = 3;
        int y = 10;

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* 1 <= 변수 <= 100 이렇게는 사용 못함  --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));
    }
}
