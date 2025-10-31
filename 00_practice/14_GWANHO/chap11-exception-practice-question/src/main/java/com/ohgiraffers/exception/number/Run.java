package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }

    public void test() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int b = Integer.parseInt(sc.nextLine());

        try {
            NumberProcess np = new NumberProcess();
            boolean ret = np.checkDouble(a, b);

            System.out.print(a + "는 " + b + "의 배수");
            System.out.println((ret) ? "이다" : "가 아니다");
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
