package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        new Run().test5();
    }

    public void test5(){
        Scanner sc = new Scanner(System.in);
        StringValidator sv = new StringValidator();

        System.out.print("문자열을 입력하세요 (5자 이상 10자 이하): ");
        String inputStr = sc.nextLine();

        try {
            if (sv.isValidLength(inputStr)) {
                System.out.println("문자열의 길이가 유효합니다.");
            }
        } catch (StringLengthException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
