package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    //필드
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);
    AniBook ab = new AniBook();
    //메소드
    public void mainMenu() {
        // 멤버 로그인
        System.out.print("이름,나이,성별을 입력해주세요 : ");
        String name = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        Member member = new Member(name, age, gender);
        lm.insertMember(member);

        // 메인 메뉴
        int op;
        do {
            System.out.println("""
                    ==== 메뉴 ====
                    1.마이페이지
                    2.도서 전체 조회
                    3.도서 검색
                    4.도서 대여하기
                    0.프로그램 종료하기
                    """);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(lm.myInfo());
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
                    System.out.print("프로그램을 종료하였습니다");
                    break;
                default:
                    System.out.println("다시 선택해주세요");
                    break;
            }
        } while (op != 0);

    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        int i = 0;
        for (Book book : bList) {
            System.out.println(i + "번도서 : " + book.toString());
            i++;
        }

    }

    public void searchBook() {
        sc.nextLine();
        System.out.print("검색할 제목 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        int isSearched = 0;
        for (Book book : searchList) {
            if (book != null) {
                System.out.println(book.getTitle());
                isSearched++;
            }
        }
        if (isSearched == 0) {
            System.out.println("검색된 내용이 없습니다.");}
    }
    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index =  sc.nextInt();
        int op = lm.rentBook(index);
        switch (op) {
            case 0:
                System.out.println("성공적으로 대여 되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여 되었습니다. "
                + "요리학원 쿠폰이 발급 되었습니다. \n" +
                        "마이 페이지를 통해 확인하세요");
                break;
            default:
                System.out.println("없는 책입니다. 다시 입력해주세요.");
        }
    }
}
