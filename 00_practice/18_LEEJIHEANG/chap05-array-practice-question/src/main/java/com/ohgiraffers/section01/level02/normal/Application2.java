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
        System.out.print("주민등록번호를 입력하세요 : ");
        String number = sc.nextLine();
        char[] numberchar = number.toCharArray();
        for(int i = 8; i < number.length(); i++ ) {
        numberchar[i] = '*';
        }
        String numbercharstr = new String(numberchar);
        System.out.println(numbercharstr);

        // 입력받은 주민등록번호를 문자 배열로 저장하기


        // 8번째 자리부터 12번쨰 자리까지 *으로 변환하기

        }
}
