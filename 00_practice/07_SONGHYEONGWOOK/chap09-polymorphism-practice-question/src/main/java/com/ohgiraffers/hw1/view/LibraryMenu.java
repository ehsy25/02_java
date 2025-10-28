package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);


    public void mainMenu() {
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        System.out.print("성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);

        Member member = new Member(name, age, gender, 0);

        while (true) {
            String menu = """
                    ========== 회원 관리 프로그램 ============
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    ==========================================
                    메뉴 선택 : """;
            System.out.print(menu);
            int no = sc.nextInt();
            sc.nextLine();

            switch (no) {
                case 1:
                    lm.insertMember(member);
                    System.out.println(lm.myInfo()); break;
                case 2: selectAll(); break;
                case 3: searchBook(); break;
                case 4: rentBook(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");;
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for(int i = 0; bList.length > i; i++) {
            System.out.println(i + "번 도서" + bList[i].getTitle() + " / "
            + bList[i].getAuthor() + " / " + bList[i].getPublisher());
        }
    }

    public void searchBook() {
//        String[] titleArray = new String[5];
//        for (int i = 0; i < titleArray.length; i++) {
//            titleArray[i] = lm.getbList()[i].getTitle();
//        }

        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchBook = lm.searchBook(keyword);

        if (searchBook.length != 0) {
            for (int i = 0; i < searchBook.length; i++) {
                if(searchBook[i] != null) {
                    System.out.println(searchBook[i].getTitle() + " / ");
                }
            }
        } else {
            System.out.println("검색하신 키워드의 책이 없습니다.");
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int bookNumber = sc.nextInt();

        int canRent = lm.rentBook(bookNumber);
        if(canRent == 0) {
            System.out.println("성공적으로 대여되었습니다");
        } else if(canRent == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if(canRent == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다." +
                    " 마이페이지를 통해 확인하세요.");
        }
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
