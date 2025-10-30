package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    Scanner sc = new Scanner(System.in);
    ArrayProcessor ap = new ArrayProcessor();
    public static void main(String[] args) {
        Run run = new Run();
        run.test4();
    }

    public void test4(){
        int index = sc.nextInt();
        int[] arr = new int[]{1,2,3};
        sc.nextLine();
        try{
            int result = ap.getElementAtIndex(arr,index);
            System.out.println("인덱스 " + index + "의 값은 "+result + "입니다.");
        }catch (ArrayLengthException e){
            e.printStackTrace();
        }

    }
}
