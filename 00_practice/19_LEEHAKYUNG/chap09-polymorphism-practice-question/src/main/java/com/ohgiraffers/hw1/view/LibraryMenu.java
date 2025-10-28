package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    Scanner sc =  new Scanner(System.in);
    LibraryManager lm = new LibraryManager();

    public void mainMenu() {
        System.out.print("회원 이름: ");
        String name = sc.nextLine();
        System.out.print("회원 나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("회원 성별: ");
        char gender = sc.next().charAt(0);

        Member newMem = new Member(name, age, gender);
        lm.insertMember(newMem);

        int menuNum;
        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print(">>>메뉴 번호를 입력하세요: ");
            menuNum = sc.nextInt();
            sc.nextLine();
            if (menuNum == 0) break;
            switch (menuNum) {
                case 1:
                    lm.myInfo(); break;
                case 2:
                    this.selectAll(); break;
                case 3:
                    this.searchBook(); break;
                case 4:
                    this.rentBook(); break;
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + ((Book) bList[i]).toString());
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] bList = lm.searchBook(keyword);

        for (Book book : bList) {
            if (book == null) {
                break;
            }
            else {
                System.out.println(book.toString());
            }
        }
    }

    public void rentBook() {
        System.out.print("대여할 도서 번호 선택 : ");
        int bNum =  sc.nextInt();
        sc.nextLine();
        int result = lm.rentBook(bNum);
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        }
        else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        }
        else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }
}
