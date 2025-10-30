package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }
    public void test5(){
        try {
            System.out.print("문자열을 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            StringValidator validator = new StringValidator();
            validator.isValidLength(str);
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());;
        }

    }
}
