package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 박싱(Boxing) 과 언박싱(UnBoxing)
        * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
        * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
        * */
        int intvalue = 20;
//        Integer boxingNumber1 = new Integer(intvalue);
        Integer boxingNumber1 = Integer.valueOf(intvalue); // static 메소드 int -> Integer

        int unBoxingNumber = boxingNumber1.intValue(); // Integer -> int

        // 오토박싱
        Integer boxingNumber2 = intvalue;

        // 오토언박싱
        int unBoxingNumber2 = boxingNumber2;

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1)); // Integer, int 값비교
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));

        System.out.println("integer 와 integer 비교 : " + (integerNum1 == integerNum2)); // Integer, Integer 주소값비교
        System.out.println("integer 와 integer 비교 : " + (integerNum1 == integerNum3));

        /* 인스턴스의 값 비교는 항상 equals()메소드를 활용한다.*/
        System.out.println(integerNum1.equals(integerNum2));
    }
}
