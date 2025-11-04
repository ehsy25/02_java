package com.lhw.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System. out.println("localTime : " + localTime);
        System.out.println("초 :"+ localTime.getSecond());
        System.out.println("분 : "+ localTime.getMinute());
        System. out.println("시 : " + localTime.getHour());

        System. out.println();

        LocalDate localDate = LocalDate.now();
        System. out.println("localDate : " + localDate);
        System.out.println("일년 중 몇번째 일 : " + localDate.getDayOfYear());
        System.out.println("월 중 몇 번째 일 : " + localDate.getDayOfMonth());
        System.out.println("월(영어) : " + localDate.getMonth());
        System. out.println("월 : " + localDate.getMonthValue());
        System. out.println("년 :"+ localDate.getYear());
        System.out.println("요일(영어) : " + localDate.getDayOfWeek());

        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
        LocalDateTime localDateTime3 = localDateTime.withDayOfYear(1);
        LocalDateTime localDateTime4 = localDateTime.plusDays(20);
        LocalDateTime localDateTime5 = localDateTime.minusYears(10);

        System. out.println("localDateTime : " + localDateTime);
        System.out.println("분 변경 : " + localDateTime1);
        System.out.println("시 변경 : " + localDateTime2);
        System.out.println("일 변경 : " + localDateTime3);
        System.out.println("일 변경 : " + localDateTime4);
        System.out.println("년 변경 : " + localDateTime5);

        /*
* time패키지의 클래스들은 불변의 특징을 가지고 있다.
* 객체가 가진 년,월,일,시,분,초 등을 변경하게 되면 새로운 객체가 생성되어 반환되므로
주소값은 같지 않다.|
* */
        System. out.println(localDateTime == localDateTime1);
        System. out.println(localDateTime == localDateTime2);
        System.out.println(localDateTime == localDateTime3);


    }
}
