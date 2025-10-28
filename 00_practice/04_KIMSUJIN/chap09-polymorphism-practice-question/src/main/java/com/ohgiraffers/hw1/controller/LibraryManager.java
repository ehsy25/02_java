package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {

    Member mem = null;
    Book[]  bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member){
        // 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
        mem = member;
    }

    public Member myInfo(){
        // 회원 레퍼런스(mem) 주소 값 리턴
        return mem;
    }

    public Book[] selectAll(){
        // 도서 목록 레퍼런스(bList) 주소 값 리턴
        return bList;
    }

    public Book[] searchBook(String keyword){
        // 검색 결과를 담아줄 새로운 Book 객체 배열 생성
        // 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
        Book[] resultList = new Book[5];

        // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
        int count = 0;
        for(int i = 0; i < bList.length; i++){
            // 전달받은 keyword를 포함하고 있으면
            if(bList[i].getTitle().contains(keyword)){
                // 검색결과의 도서목록에 담기
                resultList[count] = bList[i];
                count++;
            }
        }
        return resultList;
    }

    public int rentBook(int index){
        int result = 0;
        //나이제한여부
        if(bList[index] instanceof AniBook){
            if(((AniBook) bList[index]).getAccessAge() > mem.getAge() ){
                result = 1;
                System.out.println("나이제한으로 대여 불가");
            }
        }

        //요리책쿠폰 조건
        if(bList[index] instanceof CookBook){
            if(((CookBook) bList[index]).isCoupon()){
                mem.setCouponCount(mem.getCouponCount()+1);
                result = 2;
            }
        }
        return result;
    }

    //getter/setter


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
}
