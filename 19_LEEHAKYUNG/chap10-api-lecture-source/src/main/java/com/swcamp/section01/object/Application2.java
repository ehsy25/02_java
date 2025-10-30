package com.swcamp.section01.object;

import com.swcamp.section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {

        /*
        Object클래스의 equals()메소드

        equals()메소드 오버라이딩
        equals 메소드는 매개변수로 전달받은 인스턴스와 ==연산하여 true or false를 리턴한다.
        즉, 동일한 인스턴스인지를 비교하는 기능을 한다.

        동일객체와 동등객체
        동일객체: 주소가 동일한 인스턴스를 동일객체라고 한다.
        동등객체: 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
         */
        Book book1 = new Book(1, "홍길동전", "허균", 40000);
        Book book2 = new Book(1, "홍길동전", "허균", 40000);

        System.out.println("book1.hashCode() : " + book1.hashCode());
        System.out.println("book2.hashCode() : " + book2.hashCode());

        // "==" 연산에는 toString()이 사용되므로 아래 연산은 주소값 연산이다.
        System.out.println("== operator with the two instance: " + (book1 == book2));
        System.out.println("equals() method with the two instance: " + book1.equals(book2));
    }
}
