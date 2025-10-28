package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 : ");
        String str = sc.nextLine();

        char[] strArray = str.toCharArray(); // 문자 배열로 저장

        for (int i = 7; i < strArray.length; i++) { //7번째부터 *이여야하니까
            strArray[i] = '*';
        }//""이게 아니고 ''이걸로 받아야지

        // 이 중간에 꼭 이걸..?
            System.out.println(" ");
            for (char ch : strArray) {
                System.out.print(ch); //이걸 이렇게 하면 ***가 세로로 길게 나오는데?????
            }

        sc.close();


    }
}
