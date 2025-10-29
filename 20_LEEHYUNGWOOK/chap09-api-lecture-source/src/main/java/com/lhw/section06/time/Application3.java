package com.lhw.section06.time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application3 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);

        System. out.println("localDateTime : " + localDateTime);
        System.out.println("분 변경 : " + localDateTime1);


    }
}
