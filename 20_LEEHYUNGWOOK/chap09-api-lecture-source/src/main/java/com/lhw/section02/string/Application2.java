package com.lhw.section02.string;

public class Application2 {

    public static void main(String[] args) {

        /*문자열 객체*/
        
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str2 == str3) = " + (str2 == str3));//서로 생성되는 위치가 다르다.
        System.out.println("(str3 == str4) = " + (str3 == str4));

        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());
        System.out.println("str3.hashCode() = " + str3.hashCode());
        System.out.println("str4.hashCode() = " + str4.hashCode());

        System.out.println("System.identifyHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identifyHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("System.identifyHashCode(str3) = " + System.identityHashCode(str3));
        System.out.println("System.identifyHashCode(str4) = " + System.identityHashCode(str4));
        
        str2 += "mysql"; // ""을 추가해준다.
        System.out.println("(str1 == str2) = " + (str1 == str2));

        System.out.println("(str1 == str2) = " + (str1.equals(str2)));
        System.out.println("(str1 == str3) = " + (str1 == str3));
        System.out.println("(str1 == str4) = " + (str1 == str4));
        System.out.println("(str1 == str3) = " + (str1.equals(str3)));
        System.out.println("(str1 == str4) = " + (str1.equals(str4)));
    }
}
