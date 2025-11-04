package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {
    Scanner sc  = new Scanner(System.in);
    StringValidator sv = new StringValidator();

    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }

    public void test5(){
        String s = sc.nextLine();

        try{
            if(sv.isValidLength(s)){
                System.out.println("문자열의 길이가 유효합니다");
            }
        }
        catch (StringLengthException e){
            e.printStackTrace();
        }
    }
}
