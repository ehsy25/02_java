package com.ohgiraffers.hw1.model.dto;

public class Book {

    //필드
    private String title;
    private String author;
    private String publisher;

    //생성자
    public Book() {}
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    //getter

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    //setter

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    //toString

    @Override
    public String toString() {
        return title +
                " / " + author +
                " / " + publisher  +
                " / ";
    }
}
