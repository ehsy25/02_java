package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("Enter Your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your gender : ");
        char gen = sc.next().charAt(0);
        sc.nextLine();

        lm.insertMember(new Member(name, age, gen));

        boolean flag = true;
        while (flag) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0 : 프로그램 종료하기");
            System.out.print("입력해주세요 : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Member mem = lm.myInfo();
                    System.out.println(mem.toString());
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
                    flag = false;
                    break;
                default:
                    System.out.print("잘못 입력하셨습니다.");
                    break;
            }

        }

    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        int i = 0;
        for (Book book : bList) {
            System.out.println(i + "번 도서 : " + book.toString());
            i++;
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] bList = lm.searchBook(keyword);

        if (bList.length == 0) {
            System.out.println("검색한 키워드 제목의 책이 없습니다.");
        } else {
            for (Book book : bList) {
                if(book==null)break;
                System.out.println(book.toString());
            }
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        sc.nextLine();

        switch (lm.rentBook(index)) {
            case 0:
                System.out.println("성공적으로 대여 되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여 되었습니다. 요리학원 쿠폰이 발급되었습니다.\n 마이페이지를 통해 확인하세요");
                break;
            default:
                break;
        }
    }
}
