package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;


public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMemeber(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
//        for (int i = 0; i < bList.length; i++) {
//            System.out.println(bList[i].toString());
//            System.out.println("");
//        }
        return bList;
    }

    public Book[] searchBook(String keyword) {
        Book[] temp = new Book[5];
        for (int i=0;i<bList.length;i++) {
            if (bList[i].getTitle().contains(keyword)) {
                temp[i] = new Book(bList[i].getTitle(),bList[i].getAuthor(),bList[i].getPublisher());
            }
        }
        return temp;
    }

    public int rentBook(int index) {
        int result = 0;
        Book book = bList[index];
        if (book instanceof AniBook aniBook) {
//            System.out.println("나이 : "+mem.getAge());
//            System.out.println("연령 : "+aniBook.getAccessAge());
//            AniBook aniBook = (AniBook)bList[index];
            if(aniBook.getAccessAge()>=mem.getAge()){
                System.out.println("나이 : "+mem.getAge()+" 연령 제한 : "+aniBook.getAccessAge());
                result = 1;
            }

        }else if (book instanceof CookBook cookBook) {
//            CookBook cookBook = (CookBook)bList[index];
            if(cookBook.isCoupon()){
                int coupon = mem.getCouponCount();
                myInfo().setCouponCount(coupon+1);
                result = 2;
            }
        }
        return result;
    }


    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }

    public void insertMemeber(String name, int age, char gender) {
    }
}



