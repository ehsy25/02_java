package com.chaewookim.section02.userexception;

import com.chaewookim.section02.exception.MoneyNegativeException;
import com.chaewookim.section02.exception.NotEnoughMoneyException;
import com.chaewookim.section02.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(20000, -10000);
            et.checkEnoughMoney(20000, 10000);

            /*
            * 예외 상황별로 catch 블럭을 따로 작성해서 처리할 수도,
            * 상위 타입의 Exception을 이용해 통합적으로 처리할 수도 있음
            * 단, 상위 타입의 Exception 블럭이 먼저 기술되면 아래로 코드가 도달하지 않으므로 컴파일 에러 발생
            * 기술 순서는 하위 타입 -> 상위 타입
            * */
        } catch (PriceNegativeException e) {
            e.printStackTrace();
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
