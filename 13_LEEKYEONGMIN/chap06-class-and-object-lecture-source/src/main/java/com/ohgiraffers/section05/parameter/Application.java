package com.ohgiraffers.section05.parameter;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /*
        파라미터로 사용 가능한 자료형
        기본자료형
        기본자료형 배열
        클래스자료형(참조자료형)
        클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
        가변인자
        */
        ParameterTest pt = new ParameterTest();
/*

 */
        int num = 20;
        System.out.println("call by 전: " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by 후: " + num);

    /*
    2. 기본 자료형 배열을 매개변수로 전달받는 메소드 호출
     */
        int[] iArr = new int[]{1, 2, 3, 4, 5}; //iArr안에는 heap에 생성된 배열의 주소값을 가지고 있다.
        System.out.println("call by reference 전 : " + Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter(iArr);
        System.out.println("call by reference 후 : " + Arrays.toString(iArr));

        /* 3. 클래스 자료형을 매개변수로 전달받는 메소드 호출 */
        Rectangle r = new  Rectangle(22,12);
//        r.calArea();
//        r.calRound();
        pt.testClassTypeParameter(r);

        // 5. 가변인자를 매개변수로 전달받는 메소드 호출 (자바는 웬만하면 권장)
        pt.testVariableLengthArrayParameter(); // 가변이므로 0개도 들어감
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순", "김탁구");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬", "낚시", "독서"});
    }


}
