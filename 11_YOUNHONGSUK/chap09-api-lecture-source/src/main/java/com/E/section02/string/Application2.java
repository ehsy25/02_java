package com.E.section02.string;

public class Application2 {

    public static void main(String[] args){
        /*문자열 만드는 방법
        * "" 리터럴 형태: 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다 (singleton_
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str 1 == str2 : " + (str1 == str2));
        System.out.println("str 2 == str3 : " + (str2 == str3));
        System.out.println("str 3 == str4 : " + (str3 == str4));

        System.out.println("str1's haschode " + str1.hashCode());
        System.out.println("str2's haschode " + str2.hashCode());
        System.out.println("str3's haschode " + str3.hashCode());
        System.out.println("str4's haschode " + str4.hashCode());

        str2 += "mysql";
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        /*문자열은 불변이라는 특징을 가진다
        * 변경시 새로 할당된다*/

    }
}
