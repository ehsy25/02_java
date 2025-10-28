package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    protected Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().trim().charAt(0);
        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);
        while(true) {
            System.out.print("1. 마이페이지 \n2. 도서 전체 조회\n3. 도서 검색 \n4. 도서 대여하기 \n0. 프로그램 종료하기");
            String menu = sc.nextLine();
            switch (menu) {
                case "1": System.out.println(lm.myInfo()); break;
                case "2": selectAll(); break;
                case "3": searchBook(); break;
                case "4": rentBook(); break;
                case "0": return;
                default:
                    System.out.println("올바른 번호를 입력하세요");
            }
        }

    }
    public void selectAll(){
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i].toString());
        }
    }
    public void searchBook(){
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] bList = lm.searchBook(keyword);

        if (bList.length == 0) {
            System.out.println("검색한 키워드 제목의 책이 없습니다.");
        } else {
            for (Book book : bList) {
                if(book==null)break;
                System.out.println(book);
            }
        }
    }
    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int index = Integer.parseInt(sc.nextLine());
        int r = lm.rentBook(index);
        if (r == 0) System.out.println("성공적으로 대여되었습니다.");
        else if (r == 1) System.out.println("나이 제한으로 대여 불가능입니다.");
        else if (r == 2) System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
    }
}

