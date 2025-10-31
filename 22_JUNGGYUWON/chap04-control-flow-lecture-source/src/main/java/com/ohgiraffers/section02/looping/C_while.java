package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {
        // 초기식
        int i = 0;
        // 조건식
        while(i < 10) {

            // 반복할 내용
            System.out.println("출력 : " + (i + 1));
            // 증감식
            i++;
        }

//        for(i = 0; i < 10; i++) {
//            System.out.println("출력 : " + (i + 1));
//        }
    }

    public void testWhileExample() {
        /*
         * 키보드로 문자열을 입력 받고 반복적으로 출력한다.
         * 단, "exit"가 입력 되면 반복을 종료한다.
         * */
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력받은 값: " + input);
        }

    }

    public void testSimpleDoWHileStatement() {

        do{
            System.out.println("조건이 false여도 최초 한번은 무조건 동작한다.");
        } while(false);
    }
}
