package com.ohgiraffers.sections03;

public class Application1 {
    public static void main(String[] args){

        final int AGE; // 상수의 변수명은 대문자로 표기 (암묵적)

        AGE = 18 ;
//            AGE = 20;
        System.out.println("AGE="+ AGE);

        int myAge= AGE ; // 오른쪽에있는 AGE 는 18이니까 정수이다 .
        System.out.println("myAge="+AGE);
    }

}
