package com.E.section03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application4 {
    public static void main(String[] args) {
        /*
         * match
         * boolean anyMatch(Predicate<? super T> predicate);      // 하나라도 조건을 만족하는 값이 있는지
         * boolean allMatch(Predicate<? super T> predicate);      // 모든 조건을 만족하는지
         * boolean noneMatch(Predicate<? super T> predicate);     // 모든 조건을 만족하지 않는지
         * */

        List<String> stringList = Arrays.asList("java","Spring","SpringBoot");

        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("java")); //조건이 하나라도 맞음
        boolean anyMatch2 = stringList.stream().allMatch(str -> str.length() > 4); //조건을 정확히 만족해야
        boolean anyMatch3 = stringList.stream().noneMatch(str -> str.contains("a")); //조건을 만족하지 못해야 참
        System.out.println(anyMatch);
        System.out.println(anyMatch2);
        System.out.println(anyMatch3);
    }

}
