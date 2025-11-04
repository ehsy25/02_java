package com.E.lambda.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.function.*;

public class Application {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Application a =  new Application();
        a.test1();
        a.test2();
    }

    private void test1(){
        String time = "";
        Supplier<String> dateformat = () -> LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
        String s = dateformat.get();
        System.out.println(s);
    }
    private void test2(){
        IntSupplier is = () -> (int) Math.random()*45;
        List<Integer> lotto = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            lotto.add(is.getAsInt());
        }
    }

    private void test3() {
        Scanner sc = new Scanner(System.in);
        IntConsumer is = (i) -> System.out.println(i/1350);
    }

    private void test4(){
        Function<Integer, Integer> currency = won -> won/1350;
        int a = currency.apply(10000);
    }

    private void test5()
    {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Consumer<String> lengthCheck = str -> 
    }

}

