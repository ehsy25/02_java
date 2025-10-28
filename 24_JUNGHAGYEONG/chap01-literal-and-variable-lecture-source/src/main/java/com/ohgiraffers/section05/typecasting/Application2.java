package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        // 의도하지않은 값 손실
//        long lNum = 80000000000L;
        long lNum = 8;
        int iNum = (int) lNum;
        System.out.println("iNum = " + iNum);

        int isum1 = (int) (iNum + lNum);
        int isum2 = iNum + (int) lNum;
        long lsum = iNum + lNum;

        // 의도한 값 손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);


    }
}
