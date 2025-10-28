package com.E.section01.object;

public class Application {

    public static void main(String[] args) {

        /*all classes are children of the object class
         * and therefor can use the methods of the object class as its own*/

        Book book1 = new Book(1,"홍길동전",  "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2,"목민심서", "정약용", 30000);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());


        /*object's toString() method has the full class name used when the instance was generated
         * and the hexadecimal hashcode and converts it to string
         * Each instance with the same value has different hashcodes*/
    }


}
