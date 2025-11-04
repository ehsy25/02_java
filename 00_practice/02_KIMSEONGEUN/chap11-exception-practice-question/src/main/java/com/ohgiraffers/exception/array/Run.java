package com.ohgiraffers.exception.array;

import com.ohgiraffers.exception.charcheck.CharCheckException;
import com.ohgiraffers.exception.charcheck.CharacterProcess;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test3();
    }

    public void test3() {

        int[] arr  = new int[3];
        ArrayProcessor ap =  new ArrayProcessor();

        Scanner sc = new Scanner(System.in);
        System.out.print("인덱스를 입력하세요 : ");
        int input = sc.nextInt();

        try {
            System.out.println("인덱스 " + input + "의 값은 [배열의 " + ap.getElementAtIndex(arr, input) + "번 값]입니다.");

        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
