package com.ohgiraffers.section02.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
         * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
         * 그 값을 출력하는 코드를 작성하시오.
         *
         * -- 출력 예시 --
         * 1  2  3  4
         * 5  6  7  8
         * 9 10 11 12
         *
         * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
         * */
    int[][] array = new int[3][4];
    array[0][0] = 1;
    array[0][1] = 2;
    array[0][2] = 3;
    array[0][3] = 4;
        System.out.print(array[0][0]+" ");
        System.out.print(array[0][1]+" ");
        System.out.print(array[0][2]+" ");
        System.out.println(array[0][3]);
    array[1][0] = 5;
    array[1][1] = 6;
    array[1][2] = 7;
    array[1][3] = 8;
        System.out.print(array[1][0]+" ");
        System.out.print(array[1][1]+" ");
        System.out.print(array[1][2]+" ");
        System.out.println(array[1][3]);
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;
        System.out.print(array[2][0]+" ");
        System.out.print(array[2][1]+" ");
        System.out.print(array[2][2]+" ");
        System.out.print(array[2][3]);
    }

}
