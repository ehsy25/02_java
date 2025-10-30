package com.swcamp.section04.wrapper;

public class Application1 {

    public static void main(String[] args) {
        /*
        Boxing과 Unboxing
            기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱이라고 하며,
            래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱이라고 한다.
         */
        int intValue = 10;
        Integer boxingNumber1 = Integer.valueOf(intValue);  // int -> Integer
        // Integer은 Object가 하는 걸 할 수 있다!

        int unboxingNumber1 = boxingNumber1.intValue();     // Integer -> int

        // 오토박싱
        Integer boxingNumber2 = intValue;
        // 오토언박싱
        int unboxingNumber2 = boxingNumber2;

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        // 다 true
        // Integer와 int끼리 값 비교
        System.out.println("compare int to Integer : " + (inum == integerNum1));
        System.out.println("compare int to Integer : " + (inum == integerNum3));
        // intger끼리 주소 비교
        System.out.println("compare Integer to Integer : " + (integerNum1 == integerNum2));
        System.out.println("compare Integer to Integer : " + (integerNum4 == integerNum2));
        // 왜 주소비교가 true가 나올까? -> Integer.valueOf()가 숫자를 캐싱하고 있어서 true가 나올 수 있음.

        /*
        인스턴스 끼리의 값 비교는 항상 equals()메소드 활용!!!!!
         */
        System.out.println(integerNum1.equals(integerNum2));


    }
}
