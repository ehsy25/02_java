package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO book = new BookDTO();


            book.printInformation();

            book.setTitle("자바의 저석");
            book.setPublisher("도우출판");
            book.setAuthor("남궁성");

            book.printInformation();


            book.setTitle("홍길동전");
            book.setPublisher("활빈당");
            book.setAuthor("허균");
            book.setPrice(5000000);
            book.setDiscountRate(0.5);

            book.printInformation();
        }

    }

