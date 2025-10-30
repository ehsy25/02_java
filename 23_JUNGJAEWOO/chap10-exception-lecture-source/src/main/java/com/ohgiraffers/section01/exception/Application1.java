package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 강제로 예외를 발생
        * throw new 예외클래스명();
        *
        * 예외처리방법
        * 1. throws로 위임
        * 2. try-catch로 처리
        * */
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(10000, 50000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            et.checkEnoughMoney(10000, 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
