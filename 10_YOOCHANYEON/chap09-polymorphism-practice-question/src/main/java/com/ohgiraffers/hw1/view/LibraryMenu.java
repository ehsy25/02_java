package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm = new LibraryManager();

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("회원의 정보를 입력하세요.");

        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);

        lm.insertMember(mem);

        while(true) {
            LibraryMenu lme = new LibraryMenu();
            System.out.println("""
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료 """);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    Member mem1 = lm.myInfo();
                    System.out.println(mem1.toString());
                   break;
                case 2:
                    lme.selectAll();
                    break;
                case 3:
                    lme.searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램 종료"); break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
            if (input == 0) {
                break;
            }
        }

    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        for(int i = 0; i < bList.length; i++) {
            System.out.println((i) + "번 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        int count = 0;
        for(Book b : searchList) {
            if(b == null) {
                break;
            } else {
                searchList[count] = b;
                System.out.println(b);
            }
            count++;
        }
    }

    public void rentBook() {

        selectAll();

        System.out.print("대여할 도서 번호 선택 : ");
        int index =  sc.nextInt();

        int result = lm.rentBook(index);

        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다."); break;
            case 1:
                System.out.println("나이 제한으로 인해 대여 불가"); break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. " +
                        "요리 학원 쿠폰 발급 성공! 마이페이지를 통해 출력하세요"); break;
        }
    }
}
