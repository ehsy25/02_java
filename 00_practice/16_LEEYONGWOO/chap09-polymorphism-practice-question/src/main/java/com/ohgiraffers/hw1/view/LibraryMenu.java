package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm=new LibraryManager();
    Scanner sc=new Scanner(System.in);



    public void mainMenu(){
        System.out.println("이름을 입력하세요 : ");
        String nam=sc.next();

        System.out.println("나이를 입력하세요 : ");
        int ag=sc.nextInt();

        System.out.println("성별을 입력하세요 : ");
        char gen=sc.next().charAt(0);
        Member mem=new Member(nam,ag,gen);
        lm.insertMember(mem);
        do {
            boolean sw=false;
            System.out.println("""
                    
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """);
            int num=sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("나이 : "+lm.myInfo().getAge()+" 이름 : "+lm.myInfo().getName()+" 성별 : "+lm.myInfo().getGender());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                   searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("종료합니다");
                    sw=true;
                    break;
            }
            if(sw) break;
        }while(true);
    }
    public void selectAll(){

        Book[] blist=lm.selectAll();

        for(int i=0; i<blist.length; i++){
                System.out.println(i+"번 : "+blist[i].toString());
        }
    }

    public void searchBook(){
        System.out.print("검색할 제목 키워드 : ");
        String str=sc.next();
        Book[] searchList=lm.searchBook(str);
        boolean asd=false;
        for (Book b : searchList) {
            if(b!=null) {
                  asd=true;
                  System.out.println(b.toString());
              }
            }
        if(!asd){
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int num=sc.nextInt();
        int result =lm.rentBook(num);
        System.out.println("result:"+result);
        switch (result){
            case 0:
                System.out.println("성공적으로 대여되었습니다. ");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요 ");
                break;
        }
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}
