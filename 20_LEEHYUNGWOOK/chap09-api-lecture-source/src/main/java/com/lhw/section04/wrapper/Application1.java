package com.lhw.section04.wrapper;

import java.sql.SQLOutput;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 박싱(Boxing)과 언박싱(Unboxing)
        * - 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라 한다.
        * - 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
        * */

        int intVal = 20;
//        Integer boxingNumber1 = new Integer(intVal);
        Integer boxingNumber1 = Integer.valueOf(intVal); //static메소드로 int -> Integer
        
        int junBoxingNumber = boxingNumber1.intValue(); // Integer -> int
        
        //오토박싱
        Integer boxingNumber2 = intVal; //알아서 바뀜.
        
        //오토 언박싱
        int unBoxingNumber2 = boxingNumber2;
        
        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        /*값 비교*/
        System.out.println("int와 Integer비교 : " + (inum == integerNum1));
        System.out.println("(inum == integerNum3) = " + (inum == integerNum3));

        /*주소값 비교*/
        /*integer.valueof() 메소드가 byte범위의 숫자는 */
        System.out.println("(integerNum1 == integerNum2) = " + (integerNum1 == integerNum2));
        System.out.println("(integerNum1 == integerNum3) = " + (integerNum1 == integerNum3));
        
        /* 인스턴스의 값 비교는 항상 equals() 메소드를 활용한다. */
        System.out.println("integerNum1.equals(integerNum2) = " + integerNum1.equals(integerNum2));
    }   
}
