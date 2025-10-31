package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public void test1() {
        Scanner sc = new Scanner(System.in);
        CharacterProcess p = new CharacterProcess();
        System.out.print("입력하세요 : ");
        String str = sc.nextLine();
        try{
            int num=p.coutAlpha(str);
            System.out.println(num);
        }catch(CharCheckException e){
            System.out.println(e.getMessage());

        }
    }
    public static void main(String[] args) {
        new Run().test1();
    }
}
