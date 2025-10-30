package com.swcamp.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            // try : 예외 발생 가능성이 있는 코드를 작성, 일반적인 코드 작성
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(100000, 50000);
            System.out.println("======= 상품 구입 완료 ========");
        } catch (Exception e) {
            // catch : try 블럭 안에서 예외가 발생할 경우 catch 블럭의 코드가 실행
            System.out.println("======= 상품 구입 불가 ========");
            e.printStackTrace();
        }

        // 예외가 발생하더라고 catch블럭 실행 후 프로세스의 수행 흐름으로 돌아와 정상 종료한다.
        System.out.println("프로그램을 종료합니다.");
    }
}
