package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {

        int num;
//        System.out.println(num);

        /*
        * heap 영역에 할당 될 경우 자료형에 따른 초기값이 설정되어 할당 됨
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 : \u0000
        * 참조(String, 나중에는 클래스....) : null
        * */
        
        int[] iarr = new int[10];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "] : " + iarr[i]);
        }

        String[] sarr = new String[10];
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] : " + sarr[i]);
        }

        char[] carr = new char[10];
        for (int i = 0; i < carr.length; i++) {
            System.out.println("carr[" + i + "] : " + carr[i]);
        }

        boolean[] barr = new boolean[10];
        for (int i = 0; i < barr.length; i++) {
            System.out.println("barr[" + i + "] : " + barr[i]);
        }

        /* 기본값 외의 값으로 초기화 하면서 배열을 생성하고 싶을 때 */
//        int[] iarr2 = new int[] {11, 22, 33, 44, 55};
        int[] iarr2 = {11, 22, 33, 44, 55};
        for (int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2[" + i + "] : " + iarr2[i]);
        }

        // 짜장면, 짬뽕, 탕수육, 삼겹살
        String[] sarr2 = {"짜장면", "짬뽕", "탕수육", "삼겹살"};
        for (int i = 0; i < sarr2.length; i++) {
            System.out.println("sarr2[" + i + "] : " + sarr2[i]);
        }

    }
}
