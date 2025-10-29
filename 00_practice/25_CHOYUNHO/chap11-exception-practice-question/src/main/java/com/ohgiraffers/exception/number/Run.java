package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public void test(){
        Scanner sc = new Scanner(System.in);
        NumberProcess np = new NumberProcess();
        try{
            System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
            int num2 = sc.nextInt();
            boolean tr=np.checkDouble(num1,num2);
            if(tr)
                System.out.println(num1+"는"+num2+"의 배수입니다.");
            else
                System.out.println(num1+"는"+num2+"의 배수가 아닙니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void main(String[] args) {
        new Run().test();
    }

}
