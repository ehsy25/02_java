package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    /***
     * 메인 메뉴를 보여주는 용도
     * 반환값은 없음(void)
     */
    public void mainMenu() {

        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);
        // LibraryManager의 insertMember() 메소드에 전달
        lm.insertMember(mem);

        System.out.println("========회원등록 완료========");
        // 메뉴의 무한 반복 생성
        boolean flag = true;
        while (flag) {
            String str = """
                    ====== 메뉴 ======
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    =================
                    """;
            System.out.println(str);
            System.out.print("선택 메뉴 : ");
            int strNum = sc.nextInt();

            switch (strNum) {
                // LibraryManager의 myInfo() 호출하여 출력
                case 1:
                    mem = lm.myInfo();
                    System.out.println(mem.toString());
                    break;

                // LibraryMenu의 selectAll() 호출
                case 2:
                    selectAll();
                    break;

                // LibraryMenu의 searchBook() 호출
                case 3:
                    searchBook();
                    break;

                // LibraryMenu의 rentBook() 호출
                case 4:
                    rentBook();
                    break;

                case 0:
                    System.out.println("프로그램 종료.");
                    flag = false;
                    break;


                default:
                    System.out.println("잘못 입력 하셨습니다, 다시 입력 해 주세요.");
            }
        }
    }

    public void selectAll(){
        Book[] bList = lm.selectAll();
        int i = 1;

        System.out.println("==================== 전체 도서 목록 ====================");
        for (Book book : bList) {
            System.out.println(i + "번 도서 : " + book.toString());
            i++;
        }
//        System.out.println(lm.selectAll());
    }

    public void searchBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        lm.searchBook(keyword);
    }

    public void rentBook(){
        // 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
        // “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
        lm.selectAll();
        Scanner sc = new Scanner(System.in);
        System.out.print("대여할 도서 번호 선택 : ");
        int index =  sc.nextInt();
        index--;
        // LibraryManager의 rentBook() 에 전달
        // 그 결과 값을 result로 받고 그 result가
        // 0일 경우 → “성공적으로 대여되었습니다.” 출력
        // 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
        // 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
        //           마이페이지를 통해 확인하세요” 출력
        switch (lm.rentBook(index)) {
            case 0:
                System.out.println("성공적으로 대여되었습니다."); break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능입니다."); break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n 마이페이지를 통해 확인하세요"); break;
            default:
                System.out.println("잘못 입력 하셨습니다, 다시 입력 해 주세요."); break;
        }
    }
}
