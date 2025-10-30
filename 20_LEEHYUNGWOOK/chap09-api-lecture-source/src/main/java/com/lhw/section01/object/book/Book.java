package com.lhw.section01.object.book;

import java.util.Objects;

public class Book {

    //필드
    private int number;
    private String title;
    private String author;
    private int price;

    /*기본생성자*/

    public Book() {
//        super();
    }
    // 매개변수 생성자
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /*toString*/
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }

}
