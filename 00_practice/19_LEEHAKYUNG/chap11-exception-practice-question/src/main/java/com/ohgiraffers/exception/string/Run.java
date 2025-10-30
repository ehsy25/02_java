package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {
    public void test5() {
        StringValidator sv = new StringValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String input = sc.nextLine();
        try {
            if (sv.isValidLength(input)) {
                System.out.println("문자열의 길이가 유효합니다.");
            }
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }
}
