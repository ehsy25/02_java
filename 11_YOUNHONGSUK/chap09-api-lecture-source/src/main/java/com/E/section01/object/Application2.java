package com.E.section01.object;

public class Application2 {
    public static void main(String[] args) {

        /*오브젝트 클래스의 equals()메소드
        *
        * equals() 메소드 오버라이딩
        * equals메소드는 매개변수로 전달받은 인스턴스와 ==연산하여 true or false를 반환한다
        * 즉 동일한 인스턴스인지를 비교하는 기능을 한다
        * 동일 객체 = 주소값 + 값이 같다
        * 동등 객체 = 주소값이 다르지만 필드 값이 같다
        * */

        Book book1 = new Book(1, "홍길동", "허균", 50000);
        Book book2 = new Book(1, "홍길동", "허균", 50000);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));




    }

}
