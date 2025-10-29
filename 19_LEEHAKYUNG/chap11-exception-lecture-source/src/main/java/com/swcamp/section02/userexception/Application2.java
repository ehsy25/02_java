package com.swcamp.section02.userexception;

import com.swcamp.section02.userexception.exception.MoneyNegativeException;
import com.swcamp.section02.userexception.exception.NegativeException;
import com.swcamp.section02.userexception.exception.NotEnoughMoneyException;
import com.swcamp.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(2000, 8000);
            /*
            예외 상황별로 catch 블럭을 따로 작성해서 처리할 수도 있고,
            상위 타입의 Exception을 이용해서 통합적으로 처리할 수도 있다.
            단, 상위 타입의 Exception블럭이 먼저 기술되면 아래로 코드가 도달할 수 없으므로
            컴파일 에러가 발생한다.
            서술 순서는 하위 타입 -> 상위 타입으로 기재한다.
             */
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
            /*
            | : 동일한 레벨의 다른 타입의 예외를 하나의 catch블록에서 처리할 수 있다.
            단 상위 타입의 Exception과 하위 타입의 Exception은 함께 서술 될 수 없다.
             */
        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally {
            /*
            try 구문이 정상적으로 동작해도 실행하고,
            exception이 발생해도 finally 구문은 동작한다.
             */
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
