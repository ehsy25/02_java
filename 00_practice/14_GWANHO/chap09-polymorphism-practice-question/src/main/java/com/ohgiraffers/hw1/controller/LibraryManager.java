package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {
    private Member member = null;
    private final Book[] books = new Book[5];

    {
       books[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
       books[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
       books[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
       books[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
       books[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member) {
        this.member = member;
    }

    public Member myInfo() {
        return member;
    }

    public Book[] selectAll() {
        return books;
    }

    public Book[] searchBook(String keyword) {
        Book[] temp = new Book[5];

        int count = 0;
        for (Book book : books) {
            if (book.getTitle().contains(keyword)) {
                temp[count++] = book;
            }
        }

        return temp;
    }

    public int rentBook(int index) {
        int result = 0;

        if(0 > index || index >= books.length) {
            return 3;
        }

        Book book = books[index];

        if(book instanceof AniBook ani) {
            if(member.getAge() < ani.getAccessAge()) {
                return 1;
            }
        } else if(book instanceof CookBook cook) {
            if(cook.getCoupon()) {
                member.setCouponCount(member.getCouponCount() + 1);
                return 2;
            }
        }
        return 0;
    }
}
