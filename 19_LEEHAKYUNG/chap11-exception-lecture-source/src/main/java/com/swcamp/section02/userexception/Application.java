package com.swcamp.section02.userexception;

import com.swcamp.section02.userexception.exception.MoneyNegativeException;
import com.swcamp.section02.userexception.exception.NegativeException;
import com.swcamp.section02.userexception.exception.NotEnoughMoneyException;
import com.swcamp.section02.userexception.exception.PriceNegativeException;

public class Application {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(2000, 1000);
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
        } catch (PriceNegativeException e) {
            e.printStackTrace();
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (NegativeException e) {     // 상위클래스인 Negative가 PriceN, MoneyN보다 위에 있으면 안된다.
            throw new RuntimeException(e);
        }
    }
}
