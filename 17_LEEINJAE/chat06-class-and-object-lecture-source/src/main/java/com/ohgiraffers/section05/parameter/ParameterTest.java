package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num){
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testReferenceTypeParameter(int[] iarr){
        iarr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iarr));
    }

    public void testPrimitiveTypeParameter(Rectangle r){

//        r.calArea();
//        r.calRound();
        pt.testClassTypeParameter(r);

        // 5. 가변인자를 매개변수로 전달받는 메소드 호출(자바는 웬만하면 권장)
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter(...str "홍길동");
        pt.testVariableLengthArrayParameter(...str: );
        pt.testVariableLengthArrayParameter();


    }
}

        public void testClassTypeParameter(String... str){
            System.out.println("str = " + Arrays.toString(str));

        }