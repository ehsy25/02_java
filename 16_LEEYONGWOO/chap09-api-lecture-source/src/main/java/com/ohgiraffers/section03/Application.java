package com.ohgiraffers.section03;

public class Application {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        System.out.println("sb : "+sb.toString());
        System.out.println("sb의 hashCode : "+sb.hashCode());

        sb.append(" is a good language");
        System.out.println("sb : "+sb.toString());

        String str="hello";
        System.out.println(str.hashCode());
        str+=" world";
        System.out.println(str.hashCode());
    }
}
