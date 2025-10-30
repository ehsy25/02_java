package com.lhw.section02.userexception;

import com.lhw.section02.userexception.exception.MoneyNegativeException;
import com.lhw.section02.userexception.exception.NegativeException;
import com.lhw.section02.userexception.exception.NotEnoughMoneyException;
import com.lhw.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

 public void checkEnoughMoney(int price, int money) throws
            PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        if (price < 0) {
            throw new PriceNegativeException("상품 가격이 음수일 수 없습니다..");
        }

        if (money < 0) {
            throw new MoneyNegativeException("잔액은 음수일 수 없습니다.");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 높습니다.");
        }


    }
}
