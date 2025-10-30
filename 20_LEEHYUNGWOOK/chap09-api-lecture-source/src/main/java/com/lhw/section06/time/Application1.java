package com.lhw.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application1 {

    public static void main(String[] args) {

        // local time
        // now() : 자신의 PC의 현재 시간 기준으로 LocalTime객체 반환
        // of() : 매개변수로 받은 시간 기준으로 LocalTime객체 반환
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(9, 12,24);

        System.out.println("timeNow = " + timeNow);
        System.out.println("timeOf = " + timeOf);

        // localDate
// now() : 자신의 PC의 현재 날짜 기준으로 LocalDate 객체 반환
// of() : 매개변수로 받은 날짜 기준으로 LocalDate 객체 반환
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = dateNow.of(2025, 1,  1);
        System. out.println("dateNow : " + dateNow);
        System. out.println("dateOf : " + dateOf);

        // LocalDateTime
// now() : 자신의 PC의 현재 시간과 날짜 기준으로 LocalDate 객체 반환
// of() : 매개변수로 받은 시간과 날짜 기준으로 LocalDate 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeNow : " + dateTimeNow);
        System. out.println("dateTimeOf : " + dateTimeOf);


    }
}

