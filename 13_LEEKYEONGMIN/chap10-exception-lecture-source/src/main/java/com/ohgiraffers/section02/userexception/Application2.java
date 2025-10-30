package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
//            //상품가격이 음수일 경우
//            et.checkEnoughMoney(-20000,10000);
//            //가진돈이 음수
//            et.checkEnoughMoney(20000,-10000);
            // 상품가격보다 가진돈이 적은 경우
            et.checkEnoughMoney(20000,10000);
            /*
            |: 동일한 레벨의 다른 타입의 예외를 하나의 catch 블록에서 처리할 수 있다.
            단, 상위타입의 Exception과 하위 타입의 Exception은 함께 서술될 수 없다.
             */

        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            e.printStackTrace();
//        } catch (MoneyNegativeException e) {
//            System.out.println(e.getMessage());
//        } catch (NotEnoughMoneyException e) {
//            System.out.println(e.getMessage());
        } finally{
            /*
            try구문이 정상적으로 동작해도 실행하고,
            exception이 발생해도 finally 구문은 동작을 한다.
             */
            System.out.println("finally 블럭의 내용이 동작함");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
