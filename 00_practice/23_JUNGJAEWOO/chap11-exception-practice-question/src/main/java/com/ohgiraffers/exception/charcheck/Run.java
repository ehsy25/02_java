package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public void test1(){
        CharacterProcess c = new CharacterProcess();
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String s = sc.nextLine();
        try {
            c.countAlpha(s);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        new Run().test1();
    }
}
