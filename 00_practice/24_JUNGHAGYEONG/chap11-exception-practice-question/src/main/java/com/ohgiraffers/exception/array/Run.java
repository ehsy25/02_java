package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {

    public void test4() {

        Scanner sc = new Scanner(System.in);

        int[] arr = {0,1,2};
        System.out.print("인덱스 값을 입력해주세요 : ");
        int index = sc.nextInt();
        sc.nextLine();
        ArrayProcessor ap = new ArrayProcessor();

        try {
            int i = ap.getElementAtIndex(arr, index);
            System.out.println("인덱스 " + index + "의 값은 [배열의 " + i + "번 값]입니다.");
        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test4();
    }
}
