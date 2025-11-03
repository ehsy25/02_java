//package com.ohgiraffers.section02.userexception.exception;
//
//public class Application2 {
//    public static void main(String[] args) {
//        ExceptionTest et = new ExceptionTest();
//        try {
//            // 상품 가격이 음수일 경우
////            et.checkEnoughMoney(-20000,100000);
//            // 가진 돈이 음수
////            et.checkEnoughMoney(20000,-100000);
//            // 상품 가격보다 가진 돈이 적은 경우
//            et.chechEnoughMoney(20000, 10000);
//
//            /*
//            * | : 동일한 레벨의 다른 타입의 예외를 하나 catch블록에서 처리할 수 있다.
//                  단, 상위 타입의 Exception과 하위 타입의 Exception 함께 서술 될 수 없다.
//            * */
//        } catch (PriceNegativeException e) {
//            e.printStackTrace();}
//          catch (MoneyNegativeException e){
//            System.out.println(e.getMessage());}
//          catch (NotEnoughMoneyException e){
//            System.out.println(e.getMessage());}
//    }
//}
