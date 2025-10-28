package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        System.out.println("hello");
        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        // nextInt() : 입력받은 값을 int형으로 반환
//        System.out.print("나이 입력 : ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);

        // 실수 값 받기
        // nextdouble() : 입력 받은 값을 double형으로 방환
//        System.out.print("키 입력 : ");
//        double height = sc.nextDouble();
//        System.out.println("height = " + height);
        
        // 논리형 입력 받기
        // nextBoolean() : 입력 받은 값을 boolean형으로 반환 true/false만 받음
//        System.out.print("true or false 를 입력 : ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);

        // 문자열 입력받기
        // next() : 공백 또는 개행문자까지만 들고 옴
//        System.out.print("이름 입력 : ");
//        String name = sc.next();
//        System.out.println("name = " + name);
//        String name2 = sc.next();
//        System.out.println("name2 = " + name2);

        // nextLine() : 개행 문자까지 다 가져옴. 공백 포함
//        System.out.print("주소 입력 : ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        // 문자
        // 문자만 입력받는 메소드는  Scanner에서 제공 XX
        // String에서 제공하는 charAt(index) 메소드를 통해 문자를 분리해서 활용할 수 있다.
        System.out.println("안녕하세요".charAt(0));

        System.out.print("아무 문자 입력 : ");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);

    }
}
