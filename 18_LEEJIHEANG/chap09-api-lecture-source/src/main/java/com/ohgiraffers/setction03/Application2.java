package com.ohgiraffers.setction03;

public class Application2 {

    public static <AbstractStringBuilder> void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        /*
        * capactiy() " 용량(현재 버퍼의 크기)를 정수형으로 반환하는 메소드
        * (문자열 + 16이 기본용량)
        * */
        System.out.println(sb.capacity());

        /*
        * append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
        * 기본 용량을 초과하는 경우에는 (기존 문자열  + 1 ) * 2를 하여 용량을 확장시킨다.
        * stackoverflow
        * */
        for( int i = 0; i< 50; i++)
            sb.append(i);

        System.out.println("sb : " + sb);
        System.out.println("capacity: ");

        System.out.println("sb : " + sb);

        /*
        * delete(): 시작인덱스와 종료인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        * deleteCharAt : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
        *
        * 둘 다 원본에 영향을 준다.
//        * */
//        AbstractStringBuilder sb2 = null;
//        System.out.println("delte() : " +sb2.delete(2,5));  //javamysql -> javsql
//        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(2)); // jasql
//        System.out.println("sb2 : " + sb2);

       // 특정 위치에 있는 내용 & 범위 삭제

        /*
        * insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스에 추가한다.
        * 원본에 영향을 준다.
        * */
    /*
    * reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
    * 원본에 영향을 준다.
    *
    * */
        System.out.println("reverse() : sb2.reverse()");
//        System.out.println("sb2 : " + sb2);
    }


}
