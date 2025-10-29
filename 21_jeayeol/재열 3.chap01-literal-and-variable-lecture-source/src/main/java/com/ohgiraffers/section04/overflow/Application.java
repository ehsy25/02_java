package com.ohgiraffers.section04.overflow;

public class Application {
    public static void main(String[] args) {
        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE+ "~" + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int) Character. MIN_VALUE+ "~" +(int) Character.MAX_VALUE);
        // (int) 는 형변환연산자 . 정수 값으로 바꿔서 출력해줌
        System.out.println("short 값의 범위 :"+ Short.MIN_VALUE+ "~" +Short.MAX_VALUE);
        System.out.println("int 값의 범위"+  Integer.MIN_VALUE+ "~" +Integer.MAX_VALUE);
        System.out.println("long 값의 범위"+  Long.MIN_VALUE+ "~" +Long.MAX_VALUE);
        System.out.println("float 값의 범위"+ Float.MIN_VALUE+ "~" +Float.MAX_VALUE);
        System.out.println("double 값의 범위"+ Double.MIN_VALUE+ "~" +Double.MAX_VALUE);
        System.out.println("자료형의 값의 범위를 벗어나면 오버플로우 발생 ( 오류 코드도 안뜸 )");

        System.out.println("=====================");

        byte num1 = -127;
        System.out.println("num1 : " + num1);						      //127 : byte의 최대 저장 범위

        num1++;														                    //1 증가
        System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위



        // 언더 플로우
        // 오버플로우의 반대 개념
        num1-- ;
        System.out.println("nim1= " + num1 );

        num1-- ;
        System.out.println("nim1= " + num1 );

        num1-- ;
        System.out.println("nim1= " + num1 ); // 예상한 범위를 넘어가면


        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("multi = " + multi);

        long longMulti = (long) firstNum * secondNum; // 강제 형변환 해서 둘중에 하나만 정수형 바뀌면 따라가니까 퍼스트넘을 int 에서 long 로 바꿈
        System.out.println("longMulti = " + longMulti);
        // 퍼스트 , 세컨드 넘을 명시할때 int 로 했기때문에 이미 오버플로우가 일어난 상태
        //

        long test = 214748367; //인트의 범위는 2147483647 까지이고 넘어가면 long ?? 이라서 오류인겨?
        System.out.println(test);




    }
}
