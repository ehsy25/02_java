package com.E.section03;

public class Application2 {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());

        for(int i = 0; i < 50; i++){
            sb.append(i);
            System.out.println("sb capacity : " + sb.capacity());
            System.out.println(sb.hashCode());
        }

        StringBuilder  sb2 = new StringBuilder("new string builder");
        sb2.delete(0,4);
        System.out.println(sb2);
        sb2.deleteCharAt(5);
        System.out.println(sb2);

        sb2.insert(2,"va");
        System.out.println(sb2);
    }

}
