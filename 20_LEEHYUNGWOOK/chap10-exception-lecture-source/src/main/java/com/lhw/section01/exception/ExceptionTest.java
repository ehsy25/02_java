package com.lhw.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("갖고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println("상품 구입하기 위한 금액이 충분합니다!");
        }else {
//            System.out.println("Not enough Minerals.. 잔액부족으로 쇼핑할 수 없습니다.");
//            return;
            throw new Exception(); // checked exception으로 이제 예외 처리를 반드시 해야한다.
        }

        System.out.println("즐거운 쇼핑하세요~");
    }
}
