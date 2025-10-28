package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;
import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.CookBook;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    public LibraryManager() {

        bList[0] = new CookBook("백종원의 집밥", " 백종원", " tvN", true);
        bList[1] = new AniBook("한번 더 해요", " 미티", " 원모어", 19);
        bList[2] = new AniBook("루피의 원피스", " 루피", " japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", " 이혜정", " 문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", " 최현석", " 소금책", true);
    }


    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    //public keywordString searchBook () {
    //return Book[];


    public Book[] searchBook(String keyword) {
        Book[] searchList = new Book[5];
        int count = 0;

        for (int i = 0; i<bList.length; i++) {
            if (bList[i].getTitle().contains(keyword)) {
                searchList[count] = bList[i];
            }
        }
        return searchList;
    }

    public int rentBook(int index) {
        int result = 0;
        Book book = bList[index];

        if (book instanceof AniBook) {
            AniBook ani = (AniBook) book;
            if (mem.getAge() < ani.getAccessAge()) {
                result = 1; // 나이 제한
            }
        } else if (book instanceof CookBook) {
            CookBook cook = (CookBook) book;
            if (cook.isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                //머냐이건 -> // member의 setter/getter을 안넣어줘서!!!!!!! 에러가 생겼던거임
                result = 2;
            }
        }

        return result;
    }
}
