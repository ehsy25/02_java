package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();
        System.out.print("문자열을 입력하세요 : ");
        String s =  sc.nextLine();

        try{
            int count = cp.countAlpha(s);
            System.out.println("영문자는 " + count + "개 만큼 있습니다");
        }

        catch (CharCheckException e) {
            e.printStackTrace();
        }
    }
}
