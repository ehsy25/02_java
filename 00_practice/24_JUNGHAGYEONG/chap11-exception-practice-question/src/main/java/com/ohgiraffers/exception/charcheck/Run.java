package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String s = sc.nextLine();
        CharaterProcess ch = new CharaterProcess();

        try {
            int result = ch.countAlpha(s);
            System.out.println(result);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test1();
    }
}
