package com.E.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {
        /*
         * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
         * split() : 정규표현식을 이용하여 문자열을 분리한다.
         *           비정형화된 문자열을 분리할 대 좋지만(공백 문자열 값 포함)
         *           정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
         *           정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정
         * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
         *                   정형화된 문자열 패턴을 분리할 대 사용하기 좋다. (공백 문자열 무시)
         *                   split()보다 속도면에서는 더 빠르다.
         *                   구분자를 생략하는 경우 공백이 기본 구분자이다.
         * */

        String emp = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도";


        String[] earr = emp.split("/");
        String[] earr2 = emp2.split("/");
        String[] earr3 = emp3.split("/");

        System.out.println(Arrays.toString(earr));
        System.out.println(Arrays.toString(earr2));
        System.out.println(Arrays.toString(earr3));

        String[] earr4 = emp3.split("/", -1);

        System.out.println(Arrays.toString(earr4));

        for(int i=0;i<earr.length;i++){
            System.out.println(earr[i]);
        }

    String[] empArr5 = emp.split("/", 2);
        System.out.println(Arrays.toString(empArr5));

        StringTokenizer st = new StringTokenizer(emp, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        System.out.println(st.hasMoreTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }

        System.out.println("=========================");

        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }

        String color = "red*orange#blue/yellow green";
        String[] colors = color.split("[*/ #]");
        System.out.println(Arrays.toString(colors));

        //StringTokenize의 두번째 인자 문자열 자체는 연속된 문자열이 아닌
        // 하나하나를 구분자로 이용하겠다는 의미
        StringTokenizer st4 =  new StringTokenizer(color, "[*/ #]");
        while(st4.hasMoreTokens()){
            System.out.println(st4.nextToken());
        }


    }

}
