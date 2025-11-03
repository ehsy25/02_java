package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String name = sc.nextLine();
        CharacterProcess countAlpha = new CharacterProcess();
        countAlpha(name);
    }

}
