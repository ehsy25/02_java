package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public void test1() {

        CharacterProcess cp = new CharacterProcess();
        Scanner sc  = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String input = sc.nextLine();
        int count = 0;
        try {
            count = cp.countAlpha(input);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("문자열에 영문자가 " + count + "개 있습니다.");
    }

    public static void main(String[] args) {

        Run run = new Run();
        run.test1();
    }
}
