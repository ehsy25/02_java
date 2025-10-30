package com.E.section02.string;

public class Application1 {

    public static void main(String[] args){

        int[] arr = new int[4];
        System.out.println(arr.length);

        /*.length(): 문자열의 길이를 정수형으로 변환*/
        System.out.println("length() : " + "hello".length());
        System.out.println("빈 문자열의 길이: " + "".length());

    /*charAt()*/
        for(int i = 0; i < "hello".length(); i++){
            System.out.println("hello".charAt(i));
        }


    /*compareTo()*/


    String indexOf = "java mariadb";

        System.out.println(("index of a : " + indexOf.indexOf("")));

        System.out.println(indexOf.lastIndexOf("db"));


        String sub = "javamysql";
        sub.substring(0,4);

        System.out.println(sub.substring(3,6));

        String empty = "is it empty";
        System.out.println(empty.isBlank());
    }


}
