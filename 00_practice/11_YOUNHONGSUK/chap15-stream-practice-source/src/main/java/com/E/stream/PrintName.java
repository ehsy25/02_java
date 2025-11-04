package com.E.stream;

import java.util.List;

public class PrintName {
    List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");


    public void printNames(List<String> names){
        names.stream().filter(str -> {
            if(str.length() >= 5){
            }
        }).forEach(System.out::println);
    }
}
