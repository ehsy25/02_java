package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }
    public void test5() {
        Scanner sc = new Scanner(System.in);
        StringValidator sv = new StringValidator();

        System.out.print("문자열을 입력하세요 : ");
        String s =  sc.nextLine();

        try {
            if (sv.isValidLength(s)) {
                System.out.println("문자열의 길이가 유효합니다.");
            }
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());
        }

    }
}
