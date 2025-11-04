package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Run run = new Run();
        run.test4();
    }
    public void test4(){
        int[] arr=new int[3];
        System.out.print("인덱스 입력 : ");
        int a=scanner.nextInt();
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        try{
            int result = arrayProcessor.getElementAtIndex(arr, a);
            System.out.println("arr["+a+"] = "+result);
        }catch(ArrayLengthException e){
            System.out.println(e.getMessage());
        }
    }
}
