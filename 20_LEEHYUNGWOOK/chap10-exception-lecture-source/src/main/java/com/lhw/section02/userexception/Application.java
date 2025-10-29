package com.lhw.section02.userexception;

import com.lhw.section02.userexception.exception.MoneyNegativeException;
import com.lhw.section02.userexception.exception.NegativeException;
import com.lhw.section02.userexception.exception.NotEnoughMoneyException;
import com.lhw.section02.userexception.exception.PriceNegativeException;

public class Application {

    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            /*상품 가격이 음수일 경우*/
//            exceptionTest.checkEnoughMoney(-1000, 1000);
            /*잔액이 음수*/
//            exceptionTest.checkEnoughMoney(1000, -1000);
            /*잔액<가격*/
            exceptionTest.checkEnoughMoney(1000, 500);
            /*예외 상황별로 catch블럭을 따로 작성해서 처리할 수도 있고, 상위 타입의 Exception*/
/*        } catch (Exception ex) { //아래의 내용을 상위 클래스로 받아줄 수 있다.
            ex.printStackTrace();
        }*/
        // 아래 내용은 좀 더 상세하게 나누어서 작업해주는 부분이다.
        } catch (PriceNegativeException e) {
            e.printStackTrace();
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());;
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }

    }
}
