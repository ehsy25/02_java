package com.E.section02.userexception;

import com.E.section02.userexception.ExceptionTest;
import com.E.section02.userexception.exception.MoneyNegativeException;
import com.E.section02.userexception.exception.NegativeException;
import com.E.section02.userexception.exception.NotEnoughMoneyException;
import com.E.section02.userexception.exception.PriceNegativeException;

public class Application {

    public static void main(String[] args) {
/*예외 상황별로 catch블럭을 따로 작성해서 처리할 수도 있고,
* 상위 타입의 Exception을 이용해ㅓ 통합적으로 처리할 수도 있다.
* 단 상위 타입의 Exception블럭이 먼저 기술되면 아래로 코드가 도달할 수 없으므로
* 컴파일 에러가 발생한다
* 서술 순서는 하위 타입 -> 상위 타입으로 기재한다*/
        ExceptionTest exceptionTest = new ExceptionTest();
        try{
            exceptionTest.checkEnoughMoney(220000,10000);
        } catch(MoneyNegativeException e){
            e.printStackTrace();
            System.out.println("can't have negative money");
        }catch (PriceNegativeException e){
            e.printStackTrace();
            System.out.println("can't have negative price");
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch (NegativeException e){
            e.getStackTrace();
        }

    }

}
