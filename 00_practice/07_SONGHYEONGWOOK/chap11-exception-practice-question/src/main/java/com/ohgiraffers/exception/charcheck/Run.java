package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test1();

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String s = sc.nextLine();
        int count = 0;

        CharacterProcess cp = new CharacterProcess();
        try {
            count = cp.countAlpha(s);
            System.out.println(count);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }

    }
}
