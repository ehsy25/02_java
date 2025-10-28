package com.chaewookim.hw1.view;

import com.chaewookim.hw1.controller.LibraryManager;
import com.chaewookim.hw1.model.dto.Book;
import com.chaewookim.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        String name;
        int age;
        char gender;

        int input = -1;

        String menu = """
                ===== 메뉴 =====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                """;

        System.out.print("이름 입력: ");
        name = sc.nextLine();
        System.out.print("나이 입력: ");
        age = sc.nextInt();
        System.out.print("성별 입력: ");
        gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);

        lm.insertMember(mem);

        while (input != 0) {
            System.out.println(menu);

            System.out.print("입력: ");
            input = sc.nextInt();

            sc.nextLine();

            switch (input) {
                case 1:
                    System.out.println(lm.myInfo()); break;
                case 2:
                    selectAll(); break;
                case 3:
                    searchBook(); break;
                case 4:
                    rentBook(); break;
                default:
                    System.out.println("다른 값을 입력하시오");
            }
        }
    }

    public void selectAll() {
        Book[] books = lm.selectAll();

        for (Book i : books) {
            System.out.println(i.toString());
        }
    }

    public void searchBook() {
        String input = "";

        System.out.print("키워드 입력: ");
        input = sc.nextLine();
        System.out.println("input = " + input);

        Book[] books = lm.searchBook(input);

        for (Book i : books) {
            if (i == null) {
                break;
            }
            System.out.println(i.toString());
        }
    }

    public void rentBook() {
        int index = -1;

        selectAll();

        System.out.print("index 입력: ");
        index = sc.nextInt();

        int result = lm.rentBook(index);

        switch (result) {
            case 0:
                // 만화책도 쿡북도 아님
                System.out.println("성공적으로 대여되었습니다");
                break;
            case 1:
                // 만화책
                System.out.println("나이 제한으로 대여 불가능합니다");
                break;
            case 2:
                // 쿡북
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
                break;
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
