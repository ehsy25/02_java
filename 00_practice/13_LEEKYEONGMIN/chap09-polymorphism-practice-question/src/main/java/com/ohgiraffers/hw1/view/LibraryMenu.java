package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    private Member mem;

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("이름, 나이, 성별을 입력하세요");
        String name = sc.nextLine();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        mem = new Member(name, age, gender);
        lm.insertMemeber(mem);
        int index = 0;
        while (true) {
            System.out.println("""
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """);
            int input = sc.nextInt();
            switch (input) {

                case 1:
                    System.out.println("마이페이지입니다.");
                    String info = (lm.myInfo()).toString();
                    System.out.println(info);
                    break;

                case 2:
                    System.out.println("도서 전체 조회");
                    selectAll();
                    break;

                case 3:
                    System.out.println("도서 검색");
                    searchBook();
                    break;
                case 4:
                    System.out.println("도서대여");
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;

            }

        }

    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.print(i + "번도서 : ");
            System.out.println(bList[i].toString());
        }
    }

    public void searchBook() {
        System.out.print("keyword를 입력하세요 : ");
        String keyword = sc.next();
        boolean isNull = false;
        Book[] bList = lm.searchBook(keyword);
        for (Book b : bList) {
            if(b!=null){
                isNull = true;
                System.out.println(b.toString());
            }
        }
        if (!isNull) {
            System.out.println("책이 없습니다.");
        }
    }

    public void rentBook() {
        selectAll();
        System.out.println("");
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
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
}
