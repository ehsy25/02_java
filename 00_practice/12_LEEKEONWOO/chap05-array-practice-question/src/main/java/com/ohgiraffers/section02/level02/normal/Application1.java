package com.ohgiraffers.section02.level02.normal;

import java.awt.*;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */

        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        while (true) {
            System.out.print("가로 행의 수를 입력하세요 (1~10) : ");
             x = sc.nextInt();  //가로행

            if (x > 10 || x < 0) {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }else {
                break;
            }
        }
        while (true) {
            System.out.print("세로 행의 수를 입력하세요 (1~10) : ");
             y = sc.nextInt();  //세로행

            if (y > 10 || y < 0) {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }else {
                break;
            }
        }
        char[][] carr = new char[x][y];

        for (int i = 0; i < carr.length; i++) { // 가로 행 x 만큼 반복
            for (int j = 0; j < carr[i].length; j++) { // 세로 열 y 만큼 반복

                // ★ 랜덤 대문자 생성 및 대입 ★
                // Math.random() * 26: 0.0부터 25.999... 사이의 값
                // + 65: 아스키 코드 'A' (65)부터 시작
                // (char): 정수형을 문자형(알파벳)으로 강제 형 변환
                carr[i][j] = (char)(Math.random() * 26 + 65);

                // ★ 출력 ★
                System.out.print(carr[i][j] + " ");
            }
            System.out.println(); // 한 행의 출력이 끝나면 줄 바꿈
        }

        }


    }

