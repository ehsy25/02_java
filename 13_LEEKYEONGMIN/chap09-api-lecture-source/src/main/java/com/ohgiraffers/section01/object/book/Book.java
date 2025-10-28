package com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {
    /*필드 선언*/
    private int number;
    private String title;
    private String author;
    private int price;

    /* 기본생성자 */
    public Book() {
        super();
    }

    public Book(int i, String 홍길동전, String 허균, int i1) {
    }

    /* getter 및 setter */
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ']';
    }

    /* 2. equls() 오버라이딩 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Book other = (Book) obj;
        if (this.number != other.number) {
            return false;
        }
        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        }else if (!this.title.equals(other.title)) {

        }
        return true;
    }
    /* 3. hashCode() 오버라이딩*/
    @Override
    public int hashCode() {
        
    }
}



