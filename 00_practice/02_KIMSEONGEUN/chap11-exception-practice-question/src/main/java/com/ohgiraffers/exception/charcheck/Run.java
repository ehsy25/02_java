package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test1();
    }

    public void test1() {

        CharacterProcess cp =  new CharacterProcess();

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String input = sc.next();

        try {
            System.out.println("영문자 개수 : " + cp.countAlpha(input));

        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
