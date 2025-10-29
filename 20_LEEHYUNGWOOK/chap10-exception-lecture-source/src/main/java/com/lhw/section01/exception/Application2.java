package com.lhw.section01.exception;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            /*try : 예외 발생 가능성이 있는 코드를 작성 */
            exceptionTest.checkEnoughMoney(10000,50000);
            exceptionTest.checkEnoughMoney(10000,5000);

            System.out.println("=========== 상품 구입 완료 ============");
        } catch (Exception e) {
            /*catch : try 블럭 안에서 예외가 발생할 경우 catch블럭의 코드가 실행된다.*/
            System.out.println("=========== 상품 구입 불가 ============");
            e.printStackTrace(); // 콘솔창에 에러 내용 확인할 수 있음
        }
        /*예외가 발생하더라도 try-catch문 이후로는 순차적으로 흘러간다.*/
        System.out.println("프로그램을 종료합니다.");
    }
}
