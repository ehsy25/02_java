package com.lhw.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {

        /*
        * 강제로 예외를 발생
        throw new 예외클래스명();

        예외처리방법
        1. throws로 위임
        2. try-catch로 처리
        * */
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.checkEnoughMoney(30000, 40000);
        exceptionTest.checkEnoughMoney(30000, 25000);
        System.out.println("프로그램을 종료합니다.");
    }
}
