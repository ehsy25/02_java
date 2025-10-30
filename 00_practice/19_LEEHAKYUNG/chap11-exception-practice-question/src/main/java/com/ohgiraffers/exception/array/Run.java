package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {

    public void test4() {

        int[] arr = {0, 0, 0};
        ArrayProcessor ap = new ArrayProcessor();
        Scanner sc = new Scanner(System.in);
        System.out.print("인덱스를 입력하세요 : ");
        int index = sc.nextInt();
        int result = 0;
        try {
            result = ap.getElementAtIndex(arr, index);
            System.out.println("인덱스 " + index + "의 값은 " + result + "입니다.");
        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Run run = new Run();
        run.test4();
    }
}
