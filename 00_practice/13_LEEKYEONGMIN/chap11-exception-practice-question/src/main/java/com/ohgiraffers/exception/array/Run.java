package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test4();
    }
    public void test4(){
        try {
            int[] arr = new int[3];
            System.out.print("인덱스를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            ArrayProcessor ap = new ArrayProcessor();
            ap.getElementAtIndex(arr,index);
        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
