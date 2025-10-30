package com.E.section02.userexception;

import com.E.section02.userexception.exception.MoneyNegativeException;
import com.E.section02.userexception.exception.NegativeException;
import com.E.section02.userexception.exception.NotEnoughMoneyException;
import com.E.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.checkEnoughMoney(-20000, 10000);
            /*
             * |: 동일한 레벨의 다른 타입의 예외를 하나의 catch블럭에서 처리할 수 있다
             * 단 상위 타입의 Exception과 하위 타입의 Exception은 함께 서술 될 수 없다
             * */
        } catch (MoneyNegativeException | PriceNegativeException | NotEnoughMoneyException e) {
            e.printStackTrace();
            System.out.println("can't have negative money");
        } finally{
            /*모든 상황에서 한 번은 실행됨*/
            System.out.println("finally working");
        }

    }
}