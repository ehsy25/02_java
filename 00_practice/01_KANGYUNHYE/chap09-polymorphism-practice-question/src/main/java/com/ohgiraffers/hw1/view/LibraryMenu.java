package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();

    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("회원 이름 : ");
        String name = sc.nextLine();
        System.out.print("회원 나이 : ");
        int age =  Integer.parseInt(sc.nextLine());
        System.out.print("회원 성별 : ");
        char gender = sc.nextLine().charAt(0);

        Member mem = new Member(name,age,gender);

        lm.insertMember(mem);

        String menu = """
                ===========메뉴==========
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                번호 : """;

        while(true){
            System.out.print(menu);
            int num  = sc.nextInt();
            sc.nextLine();

            switch (num){
                case 1:
                    System.out.println(lm.myInfo().toString()); break;
                case 2:selectAll(); break;
                case 3:

                    searchBook(); break;
                case 4:

                    rentBook(); break;
                default:
                    System.out.println("다른 번호를 입력하세요.");
                case 0: break;
            }
            if(num== 0){
                break;
            }
        }


    };

    public void selectAll(){
        Book[] bList = lm.selectAll();

        for(int i=0; i<bList.length; i++){
            System.out.println(i+"번 도서 : " + bList[i].getTitle()+ " " + bList[i].getAuthor());
        }

    };
    public void searchBook(){
        System.out.print("검색할 도서를 입력하세요 : ");
        String keyword = sc.nextLine();
        Book[] searchList= lm.searchBook(keyword);

        for(Book s:searchList){
            if(s!=null){
                System.out.println(s.getTitle()+ " ");

            }
        }

    };
    public void rentBook(){
        System.out.print("대여할 인덱스를 구하세요 : ");
        int index = sc.nextInt();
        switch(lm.rentBook(index)){
            case 0:
                System.out.println("성공적으로 대여되었습니다."); break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");  break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인해주세요.");
        };

    };



}
