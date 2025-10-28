package com.lhw.section02.string;

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
        // '/' 구분자
        String emp1 = "100/홍/서울/영업";
        String emp2 = "200/유관//총무";
        String emp3 = "300/이/경기/";

        String[] empArr = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        System.out.println(Arrays.toString(empArr));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));

        System.out.println("===========");
        // 음수를 마지막 인자로 넣어주게 되면 마지막 구분자 뒤의 값이 존재하지 않는
        // 경우 빈 문자열로 토큰을 생성
        String[] empArr4 = emp3.split("/", -1);

        System.out.println(Arrays.toString(empArr));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));
        System.out.println(Arrays.toString(empArr4));

        // limit 매개변수는 해당 문자열을 앞에서부터 몇 조각 낼지 정할 수 있도록한다.
        String[] empArr5 = emp1.split("/", 3);
        System.out.println(Arrays.toString(empArr5));

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()) {
            System.out.println("st1.nextToken() = " + st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            System.out.println("st2.nextToken() = " + st2.nextToken());
        }
        while (st3.hasMoreTokens()) {
            System.out.println("st3.nextToken() = " + st3.nextToken());
        }

        System.out.println("=================");


        while (st3.hasMoreTokens()) {
            System.out.println("st3.nextToken() = " + st3.nextToken());
        }

        String colorStr = "red*orange#blue/yellow green";
        String[] colors = colorStr.split("[*/ #]");
        //정규표현식: []안에 있는 모든 특수기호를 모두 split해준다는 의미를 가진다.
        System.out.println(Arrays.toString(colors));

        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*/ #");
        while (colorStringTokenizer.hasMoreTokens()) {
            System.out.println("colorStringTokenizer = " + colorStringTokenizer.nextToken());
        }
    }
}
