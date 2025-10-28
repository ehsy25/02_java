package com.swcamp.section02.string;

import org.w3c.dom.ls.LSOutput;

public class Application2 {

    public static void main(String[] args) {

        /*
        문자열 객체를 만듣는 방법
        "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. -> 싱글톤(singleton)
        new String("문자열") : 매번 새로운 인스턴스를 생성한다.
         */
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));
        System.out.println("str1.hashCode() : " + str1.hashCode());
        System.out.println("str2.hashCode() : " + str2.hashCode());
        System.out.println("str3.hashCode() : " + str3.hashCode());
        System.out.println("str4.hashCode() : " + str4.hashCode());
        System.out.println("Identity str.hashCode() : " + System.identityHashCode(str1));
        System.out.println("Identity str.hashCode() : " + System.identityHashCode(str2));
        System.out.println("Identity str.hashCode() : " + System.identityHashCode(str3));
        System.out.println("Identity str.hashCode() : " + System.identityHashCode(str4));

        /*
        리터럴로 정의한 string이어도 그 내용이 달라지면
        string pool 내의 다른 문자열 주소를 가리키는 것이므로 그 주소가 달라진다.
         */
        str2 += "mysql";
        System.out.println(str1 == str2);
        System.out.println("st1.equals(str3) : " + str1.equals(str3));
        System.out.println("st1.equals(str4) : " + str1.equals(str4));
        // 문자열은 불변하는 객체이다! 변경 시 새 객체가 할당된다.
    }
}
