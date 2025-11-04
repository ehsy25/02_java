package com.lhw.section06.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* Calendar 를 Date 로 변환 */
        // 1. getInstance()
        Calendar calendar = Calendar.getInstance(); //static
        System.out.println("calendar = " + calendar);

        // 2. gregorianCalendar -> Calendar 상속받음
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("gregorianCalendar = " + gregorianCalendar);

        /* 2-2 년, 월, 일, 시, 분, 초 정보를 이용해서  인스턴스 생성
        * 2025년 10월 28일 16:27:00
        * */
        int year = 2025;
        int month = 9; // 월은 0~11 사용하기 때문에
        int dayOfMonth = 28;
        int hour = 16;
        int minute = 27;
        int second = 0;

        Calendar calendar1 = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);
        System.out.println("calendar1 = " + calendar1);

        /* 상황에 따라 특정 일자를 기준으로 한 Date 타입의 인스턴스가 필요한 경우도 있다.
        * 먼저 GregorianCalendar를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
        * 1970년 1월 1일 0시 0분 0초 를 기준으로 지난 시간을 milisecond로 계산해서
        * long형으로 반환하는 메소드가 있다.*/
        System.out.println("calendar1 = " + calendar1.getTimeInMillis());
        Date date = new Date(calendar1.getTimeInMillis()); // <- 여기에  calendar가져옴
        System.out.println("date = " + date);

        // 실제 사용시 이런 형태로 사용되는 경우가 많다.
        Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, minute, second).getTimeInMillis());

        /* 생성된 인스턴스의 필드 정보를 Calendar클래스에 있는 get()메소드를 사용하여
        * 반환받을 수 있다.*/
        int cYear = calendar1.get(1); //연도를 갖고 옴
        int cMonth = calendar1.get(2);
        int cDayofMonth = calendar1.get(5);

        System.out.println("cYear = " + cYear);
        System.out.println("cMonth = " + cMonth);
        System.out.println("cDayofMonth = " + cDayofMonth);

        //하나하나 치기 번거로우니 상수 필드로 사용 중이다.
        /*인자로 전달하는 정수에 따라 필드 값을 변환 받을 수 있다.
        * 하지만 이렇게 사용하게 되면 각 필드에 매칭되는 정수를
        * 다 되워야 사용이 가능해진다.*/
        System.out.println("Calender.YEAR = " + Calendar.YEAR);
        System.out.println("Calender.MONTH = " + Calendar.MONTH);
        System.out.println("Calandar.Date = " + Calendar.DATE);

        System.out.println("calendar1.get(Calendar.YEAR) = " + calendar1.get(Calendar.YEAR));
        System.out.println("calendar1.get(Calendar.MONTH) = " + calendar1.get(Calendar.MONTH));
        System.out.println("calendar1.get(Calendar.DATE) = " + calendar1.get(Calendar.DATE));
        /* 요일 계산 (일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)) 의 의미이다.*/
        System.out.println("dayOfWeek : " + calendar1.get(Calendar.DAY_OF_WEEK));

         /* switch문으로 요일 확인*/
        String day = "";
        switch (calendar1.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: day = "일"; break;
            case Calendar.MONDAY: day = "월"; break;
            case Calendar.TUESDAY: day = "화"; break;
            case Calendar.WEDNESDAY: day = "수"; break;
            case Calendar.THURSDAY: day = "목"; break;
            case Calendar.FRIDAY: day = "금"; break;
            case Calendar.SATURDAY: day = "토"; break;
        }
        System.out.println("day = " + day);


        System.out.println("amPm : " + calendar1.get(Calendar.AM_PM));                //0은 오전 1은 오후

        System.out.println(calendar1.get(Calendar.AM_PM) == Calendar.AM? "오전": "오후");

        System.out.println("hourOfDay : " + calendar1.get(Calendar.HOUR_OF_DAY));    //24시간 체계
        System.out.println("hour : " + calendar1.get(Calendar.HOUR));                //12시간 체계

        System.out.println("min : " + calendar1.get(Calendar.MINUTE));
        System.out.println("second : " + calendar1.get(Calendar.SECOND));
    }
}
