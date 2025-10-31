package com.E.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("you have " + money + " money");

        if(money >= price){
            System.out.println("enough money");
        }else {
            throw new Exception();
            //System.out.println("not enough minerals");
        }
        System.out.println(("happy shopping"));
    }
}