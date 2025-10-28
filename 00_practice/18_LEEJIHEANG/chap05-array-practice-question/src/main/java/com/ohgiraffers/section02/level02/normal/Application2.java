package com.ohgiraffers.section02.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        String[] array = new String[12];
        array[0] = "홍길동";
        array[1] = "이순신";
        array[2] = "유관순";
        array[3] = "윤봉길";
        array[4] = "장영실";
        array[5] = "임꺽정";
        array[6] = "장보고";
        array[7] = "이태백";
        array[8] = "김정희";
        array[9] = "대조영";
        array[10] = "김유신";
        array[11] = "이사부";

        String[][] ilboondan = new String[3][2];
        ilboondan[0][0] = array[0];
        ilboondan[0][1] = array[1];
        ilboondan[1][0] = array[2];
        ilboondan[1][1] = array[3];
        ilboondan[2][0] = array[4];
        ilboondan[2][1] = array[5];
        String[][] eboondan = new String[3][2];
        eboondan[0][0] = array[6];
        eboondan[0][1] = array[7];
        eboondan[1][0] = array[8];
        eboondan[1][1] = array[9];
        eboondan[2][0] = array[10];
        eboondan[2][1] = array[11];
        System.out.println("== 1분단 ==");
        System.out.print(ilboondan[0][0]+ " ");
        System.out.println(ilboondan[0][1]);
        System.out.print(ilboondan[1][0]+ " ");
        System.out.println(ilboondan[1][1]);
        System.out.print(ilboondan[2][0]+ " ");
        System.out.println(ilboondan[2][1]);
        System.out.println("== 2분단 ==");
        System.out.print(eboondan[0][0]+ " ");
        System.out.println(eboondan[0][1]);
        System.out.print(eboondan[1][0]+ " ");
        System.out.println(eboondan[1][1]);
        System.out.print(eboondan[2][0]+ " ");
        System.out.println(eboondan[2][1]);


        /* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
         * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
         * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
         *
         * -- 출력 예시 --
         * == 1분단 ==
         * 홍길동 이순신
         * 유관순 윤봉길
         * 장영실 임꺽정
         *
         * == 2분단 ==
         * 장보고 이태백
         * 김정희 대조영
         * 김유신 이사부
         */
    }
}
