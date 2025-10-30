package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        CharaterProcess cp = new CharaterProcess();
        System.out.print("문자열을 입력하세요 : ");
        String input = sc.nextLine();
        int alphaNum = 0;
        try {
            alphaNum = cp.countAlpha(input);
            System.out.println("alphaNum = " + alphaNum);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }

    }
}
