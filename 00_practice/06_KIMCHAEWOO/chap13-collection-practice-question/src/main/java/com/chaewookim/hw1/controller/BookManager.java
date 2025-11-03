package com.chaewookim.hw1.controller;

import com.chaewookim.hw1.model.comparator.AscCategory;
import com.chaewookim.hw1.model.comparator.DescCategory;
import com.chaewookim.hw1.model.dto.BookDTO;

import java.io.IOException;
import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList = new ArrayList<>();

    public BookManager(ArrayList<BookDTO> bookList) {
        this.bookList = bookList;
    }

    public BookManager() {
    }

    public void addBook(BookDTO book) {

        bookList.add(book);
    }

    public void deleteBook(int index) {

        int resultIndex = 0;

        for (BookDTO book : bookList) {
            if (book.getbNO() == index) {
                resultIndex = bookList.indexOf(book);
                break;
            }
        }

        bookList.remove(resultIndex);
    }

    public int searchBook(String bTitle) {

        int index = -1;

        for (BookDTO book : bookList) {
            if (book.getTitle().equals(bTitle)) {
                index = bookList.indexOf(book);
            }
        }

        return index;
    }

    public void printBook(int index) {

        BookDTO book = bookList.get(index);

        if (index > bookList.size()-1 || index < 0) {
            System.out.println("조회한 도서가 존재하지 않음");
        } else if (book == null) {
            System.out.println("조회한 도서가 존재하지 않음");
        } else {
            System.out.println(book);
        }
    }

    public void displayAll() {

        BookDTO book = bookList.get(0);
        if (book == null) {
            return;
        }

        for (BookDTO i : bookList) {
            System.out.println(i);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        switch (select) {
            case 1:
                bookList.sort(new AscCategory()); break;
            case 2:
                bookList.sort(new DescCategory()); break;
            default:
                System.out.println("잘못 입력함"); break;
        }

        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {

        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}
