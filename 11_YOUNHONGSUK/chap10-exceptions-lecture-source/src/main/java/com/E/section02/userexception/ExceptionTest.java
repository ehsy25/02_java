package com.E.section02.userexception;
import com.E.section02.userexception.exception.MoneyNegativeException;
import com.E.section02.userexception.exception.NotEnoughMoneyException;
import com.E.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws MoneyNegativeException, PriceNegativeException, NotEnoughMoneyException {

        System.out.println("you have " + money + " money");
        if(price < 0){
            /*throw를 이용해서 이부분에서 강제로 예외를 발생시킴*/
            throw new MoneyNegativeException("price can't be negative");
        }
        if (money < price){
            throw new NotEnoughMoneyException("not enough minerals");
        }
        if (money < 0){
            throw new MoneyNegativeException("price can't be negative");
        }
        System.out.println(("happy shopping"));
    }

}
