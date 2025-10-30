package com.E.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest et =  new ExceptionTest();
        ExceptionTest et2 =  new ExceptionTest();

        try {
            /*try = 에외 발생 가능성이 있는 코드를 작성*/
            et.checkEnoughMoney(10000,50000);
            et2.checkEnoughMoney(50000,5000);
            System.out.println("success");
        } catch (Exception e) {
            /*catch: try블럭 안에서 예외가 발생할 경우 catch블럭의 코드가 실행*/
            System.out.println("not enough minerals");
        e.printStackTrace();
        }

        /*예외가 발생하더라도 catch블럭 실행 후 프로세스의 수행 흐름으로 돌아와 정상 종료 된다*/
        System.out.println("over");
    }

}
