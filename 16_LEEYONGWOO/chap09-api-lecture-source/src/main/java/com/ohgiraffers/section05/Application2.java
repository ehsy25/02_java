package com.ohgiraffers.section05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {


        /*Calender 클래스 사용*/

        // 1. getInstance() static 메소드 이용
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);

        //2.GregorianCalendar 이용하는 방법
        Calendar cal2=new GregorianCalendar();
        System.out.println(cal2);

        //2-2. 년 월 일 시 분 초 정보를 이용해서 인스턴스를 생성
        // 2025년 10월 28일 16:27:00
        int year=2025;
        int month=10;
        int day=28;
        int hour=16;
        int minute=27;
        int second=0;
        Calendar cal3=new GregorianCalendar(year,month-1,day,hour,minute,second);
        System.out.println(cal3);

        /*
        상황에 따라 특정 일자를 기준으로 한 Date타입의 인스턴스가 필요한 경우도 있다.
        먼저 GregorianCalendar를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
        1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서
        long형으로 반환하는 메소드가 있다.
         */
        System.out.println(cal3.getTimeInMillis());

        Date date=new Date(cal3.getTimeInMillis());
        System.out.println(date);

        /*
        실제 사용시 이런 형태로 사용되는 경우가 많다.
         */

        Date date2=new Date(new GregorianCalendar(2025,10,28,16,27,0).getTimeInMillis());

        /*
        생성된 인스턴스의 필드 정보를 Calendar클래스에 있는 get() 메소드를 사용하여 반환받을 수 있다.
         */
        /*
        인자로 전달하는 정수에 따라 필드 값을 반환받을 수 있다.
        하지만 이렇게 사용하게되면 각필드에 매칭되는 정수를 다 외워야 사용이 가능하다
        따라서 저러한 정수를 상수 필드 형태로 제공하고 있다.
         */
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DATE);

        System.out.println("year : "+cal3.get(Calendar.YEAR));
        System.out.println("month : "+cal3.get(Calendar.MONTH));
        System.out.println("day : "+cal3.get(Calendar.DATE));

        /*
        요일 (일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)) 의미이다.
         */
        System.out.println("dayOfWeek : "+cal3.get(Calendar.DAY_OF_WEEK));

        String day1="";
        switch(cal3.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY: day1="일"; break;
            case Calendar.MONDAY: day1="월"; break;
            case Calendar.TUESDAY: day1="화"; break;
            case Calendar.WEDNESDAY: day1="수"; break;
            case Calendar.THURSDAY: day1="목"; break;
            case Calendar.FRIDAY: day1="금"; break;
            case Calendar.SATURDAY: day1="토"; break;
        }
        System.out.println("요일 : "+day1);
        System.out.println("amPm : " + cal3.get(Calendar.AM_PM));                //0은 오전 1은 오후

        System.out.println(cal3.get(Calendar.AM_PM) == Calendar.AM? "오전": "오후");

        System.out.println("hourOfDay : " + cal3.get(Calendar.HOUR_OF_DAY));    //24시간 체계
        System.out.println("hour : " + cal3.get(Calendar.HOUR));                //12시간 체계

        System.out.println("min : " + cal3.get(Calendar.MINUTE));
        System.out.println("second : " + cal3.get(Calendar.SECOND));
    }


}