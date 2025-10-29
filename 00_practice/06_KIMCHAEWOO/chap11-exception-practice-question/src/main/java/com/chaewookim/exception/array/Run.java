package com.chaewookim.exception.array;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Run run = new Run();

        run.test4();
    }

    public void test4() {
        int[] arr = {1, 2, 3};
        int index = 0;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        ArrayProcessor ap = new ArrayProcessor();

        System.out.print("인덱스 입력: ");
        index = sc.nextInt();

        try {
            result = ap.getElementAtIndex(arr, index);
            System.out.println("인덱스 " + index + "의 값은 " + result + "입니다.");
        } catch (ArrayLengthException e) {
            e.printStackTrace();
        }


    }
}
