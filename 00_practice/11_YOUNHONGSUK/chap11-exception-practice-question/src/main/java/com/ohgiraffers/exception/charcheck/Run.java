package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

Run r =  new Run();
r.test1();

    }

    public void test1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        CharacterProcess cp = new CharacterProcess();
        try{
            cp.countAlpha(str);
        }catch (CharCheckException e){
            System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다");
        }

    }

}
