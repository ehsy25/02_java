package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }

    public void test5(){
        System.out.print("문자열을 입력하세요 : ");
        String a=sc.nextLine();
        StringValidator stringValidator = new StringValidator();

        try{
            if(stringValidator.isValidLength(a)){
                System.out.println("문자열의 길이가 유효합니다.");
            }

        }catch(StringLengthException e){
            System.out.println(e.getMessage());
        }
    }
}
