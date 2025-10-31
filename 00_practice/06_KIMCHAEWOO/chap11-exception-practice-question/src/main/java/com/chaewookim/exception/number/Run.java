package com.chaewookim.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();

        run.test();
    }

    public void test() {

        NumberProcess np = new NumberProcess();
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean result;

        System.out.print("첫 번째 정수 입력: ");
        a = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        b = sc.nextInt();

        try {
            result = np.checkDouble(a, b);
            if (result) {
                System.out.println(a + "는 " + b + "의 배수다");
            } else {
                System.out.println(a + "는 " + b + "의 배수가 아니다");
            }
        } catch (NumberRangeException e) {
            e.printStackTrace();
        }
    }
}
