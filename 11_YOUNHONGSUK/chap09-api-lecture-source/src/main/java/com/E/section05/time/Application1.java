package com.E.section05.time;

import java.time.LocalDateTime;

public class Application1

{

    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time = now.plusMinutes(30);

        System.out.println(now);
        System.out.println(time);
    }
}
