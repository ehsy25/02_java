package com.ohgiraffers.exception.number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        new Run().test();
    }

    public void test(){
        Scanner sc = new Scanner(System.in);
        NumberProcess np = new NumberProcess();
        int a = 0;
        int b = 0;

        try {
            System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
            a = sc.nextInt();
            System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
            b = sc.nextInt();

            boolean isMultiple = np.checkDouble(a, b);

            if (isMultiple) {
                System.out.println(a + "는 " + b + "의 배수입니다.");
            } else {
                System.out.println(a + "는 " + b + "의 배수가 아닙니다.");
            }

        } catch (NumberRangeException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("잘못된 입력입니다. 정수만 입력해야 합니다.");
        } finally {
            sc.close();
        }
    }
}
