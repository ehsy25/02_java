package com.E.section05.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*
         * 파라미터로 사용 가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형(참조자료형)
         * 4. 클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
         * 5. 가변인자
         * */

        int n = 20;
        ParameterTest pt = new ParameterTest();
        pt.pt(n);
        // call by value라 값이 변하지 않는다


            Rectangle rec = new  Rectangle(5,7);
            rec.perimeter();
            rec.area();


        int [] arr = new int[] {1,2,3,4,5,};
        System.out.println(Arrays.toString(arr));
        pt.testArra(arr);
        System.out.println(Arrays.toString(arr));
        }



}
