package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    Scanner sc = new Scanner(System.in);
    NumberProcess np = new NumberProcess();
    public static void main(String[] args) {



        Run run = new Run();
        run.test();

    }

    public void test(){
        System.out.print("1부터 100사이의 정수를 하나 입력하세요");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("1부터 100사이의 정수를 하나 입력하세요");
        int b = sc.nextInt();
        sc.nextLine();

        try{
            if(np.checkDouble(a,b)){
                System.out.println(b+"는 "+ a +"의 배수입니다.");
            }
            else{
                System.out.println(b+"는 "+ a +"의 배수가 아닙니다.");
            }
        }
        catch(NumberRangeException e){
            e.printStackTrace();
        }
    }
}
