package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }

    public void test(){
        NumberProcess numberProcess = new NumberProcess();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int b=scanner.nextInt();
        try {
            if (numberProcess.checkDouble(a, b)) {
                System.out.println(a + "는 " + b + "의 배수입니다.");
            } else {
                System.out.println(a + "는" + b + "의 배수가 아닙니다.");
            }
        }catch (NumberRangeException e){
            System.out.println(e.getMessage());
        }


    }
}
