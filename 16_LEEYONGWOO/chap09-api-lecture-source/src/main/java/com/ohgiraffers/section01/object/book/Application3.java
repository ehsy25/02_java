package com.ohgiraffers.section01.object.book;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {
        /*
        Object클래스의 명세에 작성된 일반 규약에 따르면
        equals() 메소드를 재정의하는 경우 반드시 hashCode()메소드도 재정의하도록 되어있다.
        만약 hashCode()를 재정의하지 않으면 같은 값을 가지기 때문이다.
        (강제성은 없지만 규약대로 작성하는 것이 좋다)
         */
        Book book1=new Book(1,"홍길동전","허균",50000);
        Book book2=new Book(1,"홍길동전","허균",50000);

        System.out.println("book1.hashCode() : "+book1.hashCode());
        System.out.println("book2.hashCode() : "+book2.hashCode());

        Map<Book,String> map=new HashMap<>();
        map.put(new Book(1,"홍길동전","허균",50000),"sold");
        System.out.println(map);

        Book key=new Book(1,"홍길동전","허균",50000);
        String value=map.get(key);
        System.out.println("value : "+value);

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
        
        String emp1="100/홍길동/서울/영업부";
        String emp2="200/유관순//총무부";
        String emp3="300/이순신/경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));

        System.out.println("========================");
        // 음수를 마지막 인자로 넣어주게 되면 마지막 구분자 뒤의 값이
        //존재하지 않는 경우 빈 문자열로 토큰을 생성
        String[] empArr4 = emp3.split("/",-1);
        System.out.println(Arrays.toString(empArr4));

        StringTokenizer st1=new StringTokenizer(emp1,"/");
        StringTokenizer st2=new StringTokenizer(emp2,"/");
        StringTokenizer st3=new StringTokenizer(emp3,"/");

        while(st1.hasMoreTokens()){
            System.out.println("st1 : "+st1.nextToken());
        }
        while(st2.hasMoreTokens()){
            System.out.println("st2 : "+st2.nextToken());
        }

        String colorStr="red*orange#blu/yellow green";
        //String[] colors=colorStr.split("#/");
        String[] colors=colorStr.split("[*/#]");
        System.out.println(Arrays.toString(colors));


        /**
         * StringTokenizer의 두번째 인자 문자열은 자체는 연속된 문자열이 아닌
         * 하나하나를 구분자로 이용하겠다는 의미
         */
        StringTokenizer colorStringTokenizer=new StringTokenizer(colorStr,"*/#");
        while(colorStringTokenizer.hasMoreTokens()){
            System.out.println("color : " +colorStringTokenizer.nextToken());
        }
    }
}
