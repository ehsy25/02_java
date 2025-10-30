package com.swcamp.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {

        /*
        강제로 예외를 발생
        throw new 예외클래스명();

        예외 처리 방법
        1. throws로 위임 -> checkedException으로 처리
        2. try-catch로 처리
         */
        ExceptionTest et = new ExceptionTest();
        et.checkEnoughMoney(10000, 50000);
        et.checkEnoughMoney(100000, 50000);
        System.out.println("프로그램을 종료합니다.");
    }
}
