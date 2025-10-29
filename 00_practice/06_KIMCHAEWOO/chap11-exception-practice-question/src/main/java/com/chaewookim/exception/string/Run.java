package com.chaewookim.exception.string;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }

    public void test5() {

        Scanner sc = new Scanner(System.in);
        StringValidator sv = new StringValidator();

        String input = "";

        System.out.print("문자열 입력: ");
        input = sc.nextLine();

        try {
            if (sv.isValidLength(input)) {
                System.out.println("문자열의 길이 유효");
            }
        } catch (StringLengthException e) {
            e.printStackTrace();
        }

    }
}
