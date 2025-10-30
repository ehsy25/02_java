package com.lhw.section06.calendar;

import java.util.Date;

public class Application1 {

    public static void main(String[] args) {

        /*java.util.Date 클래스*/

        /*1. 기본생성자*/
        Date today = new Date();
        System.out.println("today = " + today);

        /* getTime(): 1970년1월1일0시0분0초 이후 지난 시간을 계산해서 long타입으로 변환*/
        System.out.println("today = " + today.getTime());

        /*2. 매개변수 있는 생성자 Date(long date)
        * 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 밀리세컨드로 계산한다.
        * */
        Date time = new Date(100000L);
        System.out.println("time = " + time);

        /*1초: 1000밀리초 => 5초 : 5000밀리초*/
        //
    }
}
