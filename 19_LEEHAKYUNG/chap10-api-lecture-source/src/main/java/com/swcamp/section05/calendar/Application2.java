package com.swcamp.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /* Calendar 클래스 사용 */

        // 1. getInstance() static 메소드 이용
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // 2. GregorianCalendar 이용
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        // 2-2. 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스 생성
        int year = 2025;
        int month = 9; // month가 0-based라서 9가 곧 10월임(0~11)
        int day = 28;
        int hour = 16;
        int min = 27;
        int second = 0;

        Calendar calendar1 = new GregorianCalendar(year, month, day, hour, min, second);
        System.out.println(calendar1);

        /*
        상황에 따라 특정 일자를 기준으로 한 Date타입의 인스턴스가 필요한 경우도 있다.
        먼저 GregorianCalendar를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
        1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 milisecond로 계산하여
        long형으로 반환하는 메소드가 있다.
         */

        System.out.println(calendar1.getTimeInMillis());

        Date date = new Date(calendar1.getTimeInMillis());
        System.out.println(date);

        // 실제 사용시 이런 형태로 사용되는 경우가 많다.
        Date date2 = new Date(new GregorianCalendar(year, month, day, hour, min, second).getTimeInMillis());

        // 생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get()메소드를 사용하여 반환받을 수 있다.
        int cYear = calendar1.get(1);
        int cMonth = calendar1.get(2);
        int cDayOfMonth = calendar1.get(5);
        System.out.println(cYear);
        System.out.println(cMonth);
        System.out.println(cDayOfMonth);

        /*
        인자로 전달하는 정수에 따라 필드 값을 반환받을 수 있다.
        하지만 이렇게 사용하게 되면 각 필드에 매칭되는 정수를 다 외워야 사용이 가능하다.
        따라서 저러한 정수를 상수 필드 형태로 제공하고 있다.
         */
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DATE);

        System.out.println("year : " + calendar.get(Calendar.YEAR));
        System.out.println("month : " + calendar.get(Calendar.MONTH));
        System.out.println("day : " + calendar.get(Calendar.DATE));
        // 요일은 일요일부터 시작해서 토요일로 1 ~ 7에 매핑
        System.out.println("dayOfWeek : " + calendar.get(Calendar.DAY_OF_WEEK));

        String weekday = "";
        switch (calendar1.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: weekday = "Sunday"; break;
            case Calendar.MONDAY: weekday = "Monday"; break;
            case Calendar.TUESDAY: weekday = "Tuesday"; break;
            case Calendar.WEDNESDAY: weekday = "Wednesday"; break;
            case Calendar.THURSDAY: weekday = "Thursday"; break;
            case Calendar.FRIDAY: weekday = "Friday"; break;
            case Calendar.SATURDAY: weekday = "Saturday"; break;
        }

        System.out.println("amPm : " + calendar1.get(Calendar.AM_PM));                //0은 오전 1은 오후

        System.out.println(calendar1.get(Calendar.AM_PM) == Calendar.AM? "오전": "오후");

        System.out.println("hourOfDay : " + calendar1.get(Calendar.HOUR_OF_DAY));    //24시간 체계
        System.out.println("hour : " + calendar1.get(Calendar.HOUR));                //12시간 체계

        System.out.println("min : " + calendar1.get(Calendar.MINUTE));
        System.out.println("second : " + calendar1.get(Calendar.SECOND));
    }
}
