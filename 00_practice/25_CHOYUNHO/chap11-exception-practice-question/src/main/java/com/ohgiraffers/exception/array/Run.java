package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    public void test4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("인덱스 값을 입력하시오 : ");
        int num = sc.nextInt();
        ArrayProcessor ap = new ArrayProcessor();
        int a[] = new int[3];
        try{
            ap.getElementAtIndex(a,num);
            System.out.println("인덱스 "+ num+"의 값은 [배열의 "+num+"번 값]입니다.");
        }
        catch(ArrayLengthException e){
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        new Run().test4();
    }
}
