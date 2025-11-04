package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        int num;
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("성별 입력 : ");
        char gender = sc.next().charAt(0);
        if (gender == 'M' || gender == 'm') {
            gender = '남';
        } else if (gender == 'F' || gender == 'f') {
            gender = '여';
        } else {
            System.out.println("다시 입력해 주세요");
            System.out.print("성별 입력 : ");
            gender = sc.next().charAt(0);
        }
        lm.insertMember(new Member(name, age, gender));

        do {
            String menu = """
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """;
            System.out.println();
            System.out.println(menu);
            System.out.print("메뉴 선택 : ");
            num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    lm.myInfo();
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
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("0~4 사이의 숫자를 입력해 주세요");
            }
        } while (num != 0);
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        int i =0;
        for (int j = 0; j < bList.length; j++) {
            System.out.println(i + "번 도서 : " + bList[j].toString());
            i++;
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        lm.searchBook(keyword);
        Book[] searchList = lm.searchBook(keyword);
        boolean found = false;

        for (int j = 0; j < searchList.length; j++) {
//            try {
//                System.out.println(searchList[j].getTitle());
//            } catch (NullPointerException e) {
//                System.out.println(keyword + "에 맞는 책이 없습니다.");
//            }
            if(searchList[j] != null){
                System.out.println(searchList[j].toString());
                found = true;
            }
            if(!found){
                    System.out.println(keyword + "에 맞는 책이 없습니다.");
            }
        }
    }

    public void rentBook() {
        lm.selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        sc.nextLine();
        lm.rentBook(index);

        switch (index) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. " + " " + "쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
                break;
            default:
                System.out.println("0~2 사이의 숫자를 입력해주세요");
                break;
        }

    }
}
