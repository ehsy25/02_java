package com.E.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    /*배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다*/

    public Application() {
    }

    /*배열을 스트림으로 생성하기*/
    public static void main(String[] args) {
        String[] sarr = {"java", "mariadb", "jdbc"};
    Stream<String> stringStream = Arrays.stream(sarr);
    stringStream.forEach(System.out::println);

        System.out.println("========================");

        List<String> list = Arrays.asList("java","mariadb" ,"jdbc");;
        list.stream().forEach(System.out::println);

        System.out.println("========================");
        Stream<String> ss1 = Arrays.stream(sarr,0,2);
        ss1.forEach(System.out::println);

        System.out.println("========================");
        /*컬렉션을 스트림으로 생성하기*/
        List<String> slist =  Arrays.asList("html","css","javascript");
        slist.stream().forEach(System.out::println);
        System.out.println("========================");
        slist.forEach(System.out::println);
        //컬렉션에도 forEach기능이 정의되어 있어서 stream화 하지 않고 사용 가능

        /*Builder 를 활용한 스트림 생성*/
        Stream<String> strStream3 = Stream.<String>builder().
                add("홍길동")
                .add("2")
                .add("3")
                .build();
        strStream3.forEach(System.out::println);

        /*iterator()를 활용하여 수열 형태의 스트림을 생성*/
        Stream<Integer> intStream =
                Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(System.out::println);
    }
}
