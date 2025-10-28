package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받은 값 :" + num);
    }

    public void testReferenceTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String... str) { // ... : 가변 선언 | ...앞에 다른걸 선언 해도 되지만 뒤에는 안됨
        System.out.println("str = " + Arrays.toString(str));
    }
}
