package com.ohgiraffers.exception.string;

import java.util.Scanner;

public class Run {
    public void test5(){
        Scanner sc = new Scanner(System.in);
        StringValidator sv = new StringValidator();
        System.out.print("문자열을 입력해주세요 : ");
        String s = sc.nextLine();

        try {
            sv.isValidLength(s);
        } catch (StringLengthException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static void main(String[] args) {
        new Run().test5();
    }
}
