package com.ohgiraffers.section02.string;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3)); // 다르다. 다른 이유는 str2가 생성되는 위치와 str3이 생성되는 위치가 다르기 때문이다.
        System.out.println("str3 == str4 : " +  (str3 == str4)); // 다르다. new 연산자를 사용했기 때문이다.

        System.out.println("str1의 hashCode() : " + str1.hashCode());
        System.out.println("str2의 hashCode() : " + str2.hashCode());
        System.out.println("str3의 hashCode() : " + str3.hashCode());
        System.out.println("str4의 hashCode() : " + str4.hashCode());
        // 다 다르다는데 왜 hashCode의 값은 똑같을까?
        // hashCode가 같은 이유는 String 클래스에서 hashCode의 값을 오버라이딩했기 때문이다.
        // field에 대한 내용을 불변객체로 만들어 놨기 때문이다.

        System.out.println("========================= : " + System.identityHashCode(str1));
        System.out.println("========================= : " + System.identityHashCode(str2));
        System.out.println("========================= : " + System.identityHashCode(str3));
        System.out.println("========================= : " + System.identityHashCode(str4));
        /*
         * 문자열은 불변이라는 특성을 가진다.
         * 변경 시 새로 할당된다.
         * */

        str2 += "mysql";
        System.out.println(str1 == str2); // 2에 있는 값에 +=를 했을 때 새로운 값이 나온다.

        System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
        System.out.println("str1.equals(str4) : " + (str1.equals(str4))); // 값비교했기 때문이다.



    }
}
