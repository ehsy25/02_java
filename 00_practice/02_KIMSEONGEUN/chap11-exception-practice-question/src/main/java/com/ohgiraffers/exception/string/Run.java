package com.ohgiraffers.exception.string;

import com.ohgiraffers.exception.array.ArrayLengthException;
import com.ohgiraffers.exception.array.ArrayProcessor;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test4();
    }

    public void test4() {

        StringValidator ap =  new StringValidator();

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String input = sc.next();

        try {
            if(ap.isValidLength(input)) {
                System.out.println("문자열의 길이가 유효합니다.");
            }

        } catch (StringLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
