package com.lhw.section02.userexception;

import com.lhw.section02.userexception.exception.MoneyNegativeException;
import com.lhw.section02.userexception.exception.NegativeException;
import com.lhw.section02.userexception.exception.NotEnoughMoneyException;
import com.lhw.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            /*상품 가격이 음수일 경우*/
//            exceptionTest.checkEnoughMoney(-1000, 1000);
            /*잔액이 음수*/
//            exceptionTest.checkEnoughMoney(1000, -1000);
//            exceptionTest.checkEnoughMoney(1000, 500);
            /*정상 동작*/
            exceptionTest.checkEnoughMoney(1000, 50000);

            /*
            * |: 동일한 레벨의 다른 타입의 예외를 하나의 Catch블록에서 처리할 수 있다.
            * 단, 상위 타입의 Exception과 하위 타입의 Exception은 함께 서술 될 수 없다.
            * */
        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally {
            /*Try 구문이 정상적으로 동작해도 실행하고 exception 발생해도 동작한다. */
            System.out.println("Finally 구문 동작");
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
