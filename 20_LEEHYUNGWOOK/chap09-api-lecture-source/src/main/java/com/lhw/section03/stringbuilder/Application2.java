package com.lhw.section03.stringbuilder;

public class Application2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        
        /*
        * capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드
        * */
        System.out.println("sb.capacity() = " + sb.capacity());

        /*append(): 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
        * */

        for ( int i = 0; i< 50; i++ ) {
            sb.append(i);

            System.out.println("sb : " + sb);
            System.out.println("capacity() : " + sb.capacity());
            System.out.println("sb.hashCode() : " + sb.hashCode());
        }

        System.out.println("sb.delete(2,5) = " + sb.delete(2,5));
        System.out.println("sb.deleteCharAt(2) = " + sb.deleteCharAt(2));

        System.out.println("sb.insert(2,\"va\") = " + sb.insert(2,"va"));
        System.out.println("sb.insert(0,\"Happy\") = " + sb.insert(0,"Happy"));
        System.out.println("sb.length(), \"END\" = " + sb.insert(sb.length(), "~END"));

        StringBuilder sb2 = new StringBuilder();
        sb2.append("javahelloworld");

        /*reverse*/
        System.out.println("sb2.reverse() = " + sb2.reverse());
        
    }
    
    
}
