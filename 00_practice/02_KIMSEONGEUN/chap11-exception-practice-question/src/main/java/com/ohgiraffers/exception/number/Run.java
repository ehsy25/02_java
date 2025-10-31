package com.ohgiraffers.exception.number;

import com.ohgiraffers.exception.charcheck.CharCheckException;
import com.ohgiraffers.exception.charcheck.CharacterProcess;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test2();
    }

    public void test2() {

        NumberProcess np =  new NumberProcess();

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        try {
            System.out.println("결과 : " + np.checkDouble(num1, num2));

        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
