package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test4();
    }

    public void test4() {

        int[] arr = {0, 1, 2};

        try {
            ArrayProcessor ap = new ArrayProcessor();
            Scanner sc = new Scanner(System.in);

            System.out.print("인덱스 입력 : ");
            int index = Integer.parseInt(sc.nextLine());
            int ret = ap.getElementAtIndex(arr, index);
            System.out.println("인덱스 " + index + "의 값은 [배열의 " + ret + "번 값]입니다.");
        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
