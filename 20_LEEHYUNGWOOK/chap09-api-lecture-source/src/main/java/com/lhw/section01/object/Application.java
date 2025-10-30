package com.lhw.section01.object;

import com.lhw.section01.object.book.Book;

public class Application {

    public static void main(String[] args) {

        /*
        * 모든 클래스는 Object 클래스의 후손이다. 
        * 따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
        * 모든 클래스가 부모를 가진다는 것을 확인할 수 있는 방법은 
        * super 키워드를 통해 확인해볼 수 있다.
        * */
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(3, "목민심서", "정약용", 30000);

        /*
        * Object가 가지고 있는 toString() 메소드는 인스턴스가 생성될 때 사용한
        * full class name과 @ 그리고 16진수 Hashcode가 문자열로 반환하게 된다.
        * 동일한 값을 가지는 인스턴스(객체)도 다른 Hashcode값을 가지고 있다.
        * */
        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book3.toString() = " + book3.toString());
        System.out.println("===============================================");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);
    }   
}
