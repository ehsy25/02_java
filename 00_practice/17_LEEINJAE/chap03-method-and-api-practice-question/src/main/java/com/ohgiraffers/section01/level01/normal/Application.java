package com.ohgiraffers.section01.level01.normal;

public class Application {

    public static void main(String[] args) {

        // 실행용 클래스
        String result = RandomMaker.tossCoin();
        System.out.println("동전 던지기! 앞면(0) or 뒷면(1)? : " + result);
    }
}