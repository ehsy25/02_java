package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public void test(){
        Scanner sc = new Scanner(System.in);
        NumberProcess np = new NumberProcess();
        System.out.print("1에서 100 사이의 정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("1에서 100 사이의 정수를 하나 입력하세요 : ");
        int num2 = sc.nextInt();
        try {
            if(np.checkDouble(num1, num2)){
                System.out.println(num1 + "은 "+num2 +"의 배수입니다.");
            }else if (!np.checkDouble(num1, num2)) {
                System.out.println(num1 + "은 "+num2 +"의 배수가 아닙니다.");
            }
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Run().test();
    }
}
