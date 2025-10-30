package com.chaewookim.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }

    public void test1() {

        String input = "";
        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();

        System.out.print("문자열 입력: ");
        input = sc.nextLine();

        try {
            System.out.println(cp.countAlpha(input));
        } catch (CharCheckException e) {
            e.printStackTrace();
        }
    }
}
