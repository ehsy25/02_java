package com.swcamp.section05.calendar;

import java.util.Date;

public class Application1 {

    public static void main(String[] args) {
        /*
        java.util.Date 클래스
         */

        // 1. 기본 생성자
        Date today = new Date();
        // getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 밀리세컨드로 계산한다. -> long 반환
        System.out.println(today.getTime());

        // 2. 매개변수 있는 생성자 Date(long date)
        // 1970/1/1/0-0-0 이후 지난 시간을 밀리세컨드로 계산한다.
        Date time = new Date(10000L);
        System.out.println(time);

    }
}
