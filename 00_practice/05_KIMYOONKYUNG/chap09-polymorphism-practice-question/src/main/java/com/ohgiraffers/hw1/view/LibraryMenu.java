package com.ohgiraffers.hw1.view;
import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);
    // protected로 받았는데, 실행오류떠서 private로 수정함
    public void mainMenu() {

        System.out.println("회원이름");
        String name = sc.nextLine();

        System.out.println("회원나이");
        int age = sc.nextInt();

        System.out.println("회원 성별 M or F");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);

        lm.insertMember(mem);

        while (true) {
            System.out.println("""
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """);
            int menu = sc.nextInt();

            switch (menu) {
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
                default:
                    System.out.println("번호 재입력해주세요");
                    break;
            }
            if (menu == 0) {
                break;
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.println("검색할 제목 키워드");
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt();

        int result = lm.rentBook(index);

        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;

            case 1:
                System.out.println("나이 제한으로 대여 불가능합니다.");
                break;

            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다!");
                break;
        }
    }
}






            /* case 2 -> selectAll();
            case 3. -> searchBook();
            case 4. -> rentBook();
            case 0. -> System.out.println("종료합니다");   --> 이런식으로 xx
            return;
        }
        default -> System.out.println("잘못되 입력");
    }
}

    public void selectAll{

        }
    public void searchBook{}
    public void rentBook{}

}
ㄴㅇㄻㅇㄴㄹ ->









/*
public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);
 */


/*ublic class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("회원 이름: ");
        String name = sc.nextLine();
        System.out.print("회원 나이: ");
        int age = sc.nextInt();
        System.out.print("회원 성별(M/F): ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);

        while (true) {
            System.out.println("\n==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 -> System.out.println(lm.myInfo());
                case 2 -> selectAll();
                case 3 -> searchBook();
                case 4 -> rentBook();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서: " + bList[i]);
        }*/
