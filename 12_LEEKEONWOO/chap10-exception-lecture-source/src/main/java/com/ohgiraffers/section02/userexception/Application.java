package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            // 상품가격이 음수일 경우
//            et.checkEnoughMoney(-20000, 10000);
            // 가진 돈이 음수
//            et.checkEnoughMoney(20000,-10000);
            //상품 가격보다 가진 돈이 적은 경우
            et.checkEnoughMoney(20000, 10000);

            /*
            * 예외 상황별로 catch블럭을 따로 작성해서 처리할 수도 있고,
            * 상위 타입의 Exception을 이용해서 통합적으로 처리할 수도 있다.
            * 단, 상위 타입의 Exception블럭이 먼저 기술되면 아래로 코드가 도달할 수 없으므로
            * 컴파일 에러가 발생한다.
            * 서술 순서는 하위 타입 -> 상위 타입으로 기재한다.
//            * */
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        } catch (PriceNegativeException e) {
//            throw new RuntimeException(e);
            e.printStackTrace(); // 위에랑 같다. 오류는 발생하지만 계속해서 출력
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage()); // 오류 안나고 메세지 출력
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (NegativeException e) {
            throw new RuntimeException(e);
        }
    }
}
