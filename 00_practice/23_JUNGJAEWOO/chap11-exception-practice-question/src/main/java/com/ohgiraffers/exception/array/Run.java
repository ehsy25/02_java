package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    public void test4(){
        ArrayProcessor ap = new ArrayProcessor();
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3};
        System.out.print("인덱스를 입력해주세요 : ");
        int index = sc.nextInt();
        try {
            System.out.println(ap.getElementAtIndex(arr, index));
        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test4();
    }
}
