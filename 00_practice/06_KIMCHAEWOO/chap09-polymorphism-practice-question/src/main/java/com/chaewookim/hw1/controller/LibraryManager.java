package com.chaewookim.hw1.controller;

import com.chaewookim.hw1.model.dto.AniBook;
import com.chaewookim.hw1.model.dto.Book;
import com.chaewookim.hw1.model.dto.Cookbook;
import com.chaewookim.hw1.model.dto.Member;

public class LibraryManager {

    private Member mem = null;
    private Book[] blist = new Book[5];

    {
        blist[0] = new Cookbook("백종원의 집밥", "백종원", "tvN", true);
        blist[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        blist[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        blist[3] = new Cookbook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        blist[4] = new Cookbook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] searchBook(String keyword) {
        Book[] books = new Book[5];
        int count = 0;

        for (Book i : blist) {
            if (i.getTitle().contains(keyword)) {
                books[count] = i;
                count++;
            }
        }

        return books;
    }

    public int rentBook(int index) {
        int result = 0;

        if (blist[index] instanceof AniBook) {
            if (((AniBook) blist[index]).getAccessAge() > mem.getAge()) {
                result = 1;
            }
        } else if (blist[index] instanceof Cookbook) {
            if (((Cookbook) blist[index]).isCoupon()) {
                mem.setCouponCount(mem.getCouponCount()+1);
                result = 2;
            }
        }

        return result;
    }


    public Book[] selectAll() {
        return blist;
    }

    public Book[] getBlist() {
        return blist;
    }

    public void setBlist(Book[] blist) {
        this.blist = blist;
    }

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }
}

