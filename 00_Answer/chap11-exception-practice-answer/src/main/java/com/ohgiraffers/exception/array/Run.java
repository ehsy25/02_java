package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
       new Run().test4();
    }

    public void test4(){
        Scanner sc = new Scanner(System.in);
        ArrayProcessor ap = new ArrayProcessor();

        int[] dataArray = {10, 20, 30};
        System.out.println("배열: {10, 20, 30}");
        System.out.print("접근할 인덱스를 입력하세요 (0~2): ");
        int index = sc.nextInt();

        try {
            int result = ap.getElementAtIndex(dataArray, index);
            System.out.println("인덱스 " + index + "의 값은 " + result + "입니다.");
        } catch (ArrayLengthException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
