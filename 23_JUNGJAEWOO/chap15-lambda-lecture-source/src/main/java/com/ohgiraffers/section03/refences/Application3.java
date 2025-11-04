package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Collection 과 람다식 함께 사용
        *
        * JDK8에 추가된 default메소드 Iterable:forEach
        * JDK8에 추가된 default메소드 Collection:removeIf
        * JDK8에 추가된 default메소드 List:replaceAll
        * */


    }
    private static void test1() {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            list.add(i);
        }

//        for (Integer i : list) {
//            System.out.println(i);
//        }
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
        /* 2의 배수 제거 */
        list.removeIf(i -> i %2 ==0);
        System.out.println(list);

        /* 모든 요소에 10곱하기 */
        list.replaceAll(i -> i*10);
        System.out.println(list);
    }
}
