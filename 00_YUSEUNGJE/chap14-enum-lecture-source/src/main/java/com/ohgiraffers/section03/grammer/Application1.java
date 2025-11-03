package com.ohgiraffers.section03.grammer;

public class Application1 {

    public static void main(String[] args) {

        /* Enum type의 메소드 */

        /* 1. values() : 열거 타입의 모든 값을 배열로 반환 */
        for(EnumType enumType : EnumType.values()){
            System.out.println("enumType = " + enumType);
        }

        /* 2. valueOf(): 해당 이름을 가진 열거 타입 상수 반환 */
        for(EnumType enumType : EnumType.values()){
            if(enumType == EnumType.valueOf("JAVA")){
                System.out.println("valueOf = " + enumType);
            }
        }
    }
}
