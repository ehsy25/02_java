package com.chaewookim.hw1.view;

import com.chaewookim.hw1.model.dto.BookDTO;
import com.chaewookim.hw1.controller.BookManager;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu() {

        int input = 0;
        String menu = """
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                """;

        while (input != 6) {

            System.out.println(menu);

            System.out.print("메뉴 번호 선택: ");
            input = sc.nextInt();
            int sorting = 0;
            int bNO;
            String bTitle;
            int index = 0;

            switch(input) {
                case 1:
                    bm.addBook(inputBook()); break;
                case 2:
                    System.out.print("정렬 방식 선택. 1: 오름차순, 2: 내림차순");
                    sorting = sc.nextInt();
                    switch (sorting) {
                        case 1:
                            bm.printBookList(bm.sortedBookList(1)); break;
                        case 2:
                            bm.printBookList(bm.sortedBookList(2)); break;
                        default:
                            System.out.println("번호 잘못 입력함"); break;
                    }
                    break;
                case 3:
                    System.out.print("삭제할 도서 번호 입력: ");
                    bNO = sc.nextInt();
                    bm.deleteBook(bNO); break;
                case 4:
                    index = bm.searchBook(inputBookTitle());
                    if (index == -1) {
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else {
                        bm.printBook(index);
                    }
                    break;
                case 5:
                    bm.displayAll(); break;
                case 6:
                    break;
                default:
                    System.out.println("잘못 입력함.");
            }
        }
    }

    public BookDTO inputBook() {

        BookDTO book;
        int bNO;
        int category;
        String title;
        String author;

        System.out.print("도서 번호 입력: ");
        bNO = sc.nextInt();
        System.out.print("도서 제목 입력: ");
        sc.nextLine();
        title = sc.nextLine();
        System.out.print("도서 카테고리 입력: ");
        category = sc.nextInt();
        System.out.print("도서 저자 입력: ");
        sc.nextLine();
        author = sc.nextLine();

        book = new BookDTO(bNO, category, title, author);

        return book;
    }

    public String inputBookTitle() {

        String title;

        sc.nextLine();

        System.out.print("도서 제목 입력: ");
        title = sc.nextLine();

        return title;
    }

}
