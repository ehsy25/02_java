package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();

        run.test1();
    }

    public void test1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        try {
            CharacterProcess cp = new CharacterProcess();
            System.out.println("문자열 알파벳 개수 : " + cp.countAlpha(s));
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
