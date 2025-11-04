package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private final LibraryManager libraryManager = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("회원 정보 입력 : ");
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        char gender = sc.nextLine().charAt(0);

        libraryManager.insertMember(new Member(name, age, gender, 0));

        do {
            String menu = """
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    ==========================================
                    메뉴 선택 : """;
            System.out.print(menu);

            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    System.out.println("회원 정보");
                    System.out.println(libraryManager.myInfo().toString());
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
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");;
            }
        } while (true);
    }

    public void selectAll() {
        Book[] books = libraryManager.selectAll();

        for(int i = 0; i < books.length; i++) {
            System.out.println(i + "번 도서 : " + books[i].toString());
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword =  sc.nextLine();
        Book[] books = libraryManager.searchBook(keyword);

        for(Book book : books) {
            if(book != null) {
                System.out.println(book.toString());
            }
        }
    }

    public void rentBook() {
        System.out.print("검색할 책 인덱스 : ");
        int index = Integer.parseInt(sc.nextLine());

        int result = libraryManager.rentBook(index);
        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2:
                System.out.println( "성공적으로 대여되었습니다." +
                                    "요리학원 쿠폰이 발급되었습니다." +
                                    "마이페이지를 통해 확인하세요.");
                break;
            default:
                System.out.println("오류");
                break;
        }
    }
}
