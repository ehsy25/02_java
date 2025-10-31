package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }
    Scanner scanner = new Scanner(System.in);
    public void test1(){
        System.out.print("문자열을 입력하세요 : ");
        String str=scanner.nextLine();

        CharacterProcess characterProcess = new CharacterProcess();
        try{
            int count = characterProcess.countAlpha(str);
            System.out.println("문자의 수 " + count);
        }catch(CharCheckException e){
            System.out.println(e.getMessage());
        }

    }
}
