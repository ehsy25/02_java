//package com.ohgiraffers.section02.userexception;
//
//import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
//import com.ohgiraffers.section02.userexception.exception.NegativeException;
//import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
//import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;
//
//import java.util.regex.PatternSyntaxException;
//
//public class Application2 {
//
//    public static void main(String[] args) {
//    ExceptionTest et = new ExceptionTest();
//
//        try {
//            // 상품 가격이 음수일 경우
////            et.checkEnoughMoney(-20000,10000);
//            // 가진 돈이 음수
////            et.checkEnoughMoney(20000,-10000);
//            // 상품 가격보다 가진 돈이 적은 경우
//            et.checkEnoughMoney(20000,10000);
///*
//* 동일한 레벨의 다른 타입의 예외를 하나의 catch블록에서 처리할 수 있다.
//* 단, 상위 타입의 Exception과 하위 타입의 Exception 함께 서술될 수 없다.
//*
//* */
//        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException | NotEnoughMoneyException) {
//        } catch (NotEnoughMoneyException e) {
//            throw new RuntimeException(e);
//        } catch (MoneyNegativeException e) {
//            throw new RuntimeException(e);
//        } catch (PriceNegativeException e) {
//            throw new RuntimeException(e);
//        } finally{
//            /*try구문이 정상적으로 동작해도 실행하고,
//            * exception이 발생해도 fianlly구문은 동작을 한다.
//            * */
//            System.out.println("finally 블럭의 내용이 동작함");
//        }
//        System.out.println("프로그램을 종료합니다.");
//    }
//
//}
