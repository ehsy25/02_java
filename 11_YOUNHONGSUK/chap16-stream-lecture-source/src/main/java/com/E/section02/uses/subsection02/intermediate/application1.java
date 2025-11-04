package com.E.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.stream.IntStream;

public class application1 {

    public static void main(String[] args) {
        /*스트림의 중간연산, 중계연산 중 하나인 filter에 대해 이해하고 사용할 수 있다
        *
        * Stream<T> filter(Predicate<? super T> predicate
        * 필터(filter)는 스트림에서 특정 데이터만 걸러내는 메소드이다
        * 매개변수롷 받는 Predicate는 boolean을 리턴하는 함수형 인터페이스다
        * */
        IntStream is = IntStream.range(0,10);
        //is.filter(i -> (i % 2) == 0).forEach(System.out.print(i + " "));

        String[] sa = new String[100];
        sa[0] = "1";
        sa[1] = "2";

        int[] a = new int[sa.length];

        for(int i =0; i < sa.length; i++){

            a[i] = i + (int) (Math.random()*1000);

        }

        int max = 0;
        int min = 1000;
        for(int i =0; i < a.length; i++){
            for(int j =0; j < sa.length; j++){

                if(a[j] > max){
                    max = j;
                }
                if(a[j] < min){
                    min = j;
                }
            }

            System.out.println("max: " + a[max]);
            System.out.println("min: " + a[min]);
            a[max] -= 1;
            a[min] += 1;
        }

        System.out.println(a[max]);
        System.out.println(a[min]);

        System.out.println("==================");
        for(int j =0; j < sa.length; j++) {

            if (a[j] > max) {
                max = j;
            }
            if (a[j] < min) {
                min = j;
            }
        }

        System.out.println(a[max]);
        System.out.println(a[min]);
        System.out.println(a[max] - a[min]);

    }
}
