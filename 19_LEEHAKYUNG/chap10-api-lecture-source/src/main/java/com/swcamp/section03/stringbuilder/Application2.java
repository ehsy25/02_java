package com.swcamp.section03.stringbuilder;

public class Application2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        /*
        capacity() : 용량(현재 버퍼의 크기)를 정수형으로 반환하는 메소드
        (생성자 안에 넣은 문자열의 길이 + 16 = 기본용량)
         */
        System.out.println(sb.capacity());

        /*
        append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
        기본 용량을 초과하는 경우 (기존문자열 + 1) * 2를 하여 용량을 확장시킨다.
         */

        for (int i = 0; i < 50; i++) {
            sb.append(i);

            System.out.println("sb : " + sb);
            System.out.println("capacity : " + sb.capacity());
            System.out.println("hashCode : " + sb.hashCode());
        }

        StringBuilder sb2 = new StringBuilder("javamysql");
        /*
        delete() : 시작인덱스와 종료인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.

        둘 다 원본에 영향을 준다.
         */
        System.out.println("delete() : " + sb2.delete(2, 5));
        System.out.println("sb2 : " + sb2);
        System.out.println("deleteCharAt(2) : " + sb2.deleteCharAt(2));
        System.out.println("sb2 : " + sb2);

        /*
        insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
        원본에 영향을 준다.
         */
        System.out.println("insert() : " + sb2.insert(2, "va"));
        System.out.println("insert() : " + sb2.insert(0, "happy "));
        System.out.println("insert et the end : " + sb2.insert(sb2.length(), " byebye"));

        /*
        reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
        원본에 영향을 준다.
         */
        System.out.println("reverse() : " + sb2.reverse());
        System.out.println("reverse() : " + sb2.reverse());

    }
}
