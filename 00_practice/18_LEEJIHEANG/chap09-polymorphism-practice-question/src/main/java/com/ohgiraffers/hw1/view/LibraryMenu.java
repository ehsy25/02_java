package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm;

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {}

    // 1...이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
    // 2...LibraryManager의 insertMember 메소드로 전달
    /*프로그램 실행 시 가장 먼저 호출되
는 메소드로 회원 이름, 나이, 성별을
입력받아 LibraryManager의
insertMember 메소드로 전달
무한 반복 메뉴를 출력하여 각 메뉴
버튼 선택 시 해당 메소드 호출
(클래스 구조 참고)*/
    // 4... 무한 반복 메뉴를 출력하여 각 메뉴 버튼 선택 시 해당 메소드 호출
    // 5...1. 마이페이지 LibraryManager의 myInfo() 호출하여 출력
    // 6...2. 도서전체조회 LibraryManager의 selectAll() 호출하여 출력
    // 7...3. 도서 검색 LibraryManager의 searchBook() 호출하여 출력
    // 8...4. 도서 대여하기 LibraryManager의 rentBook() 호출하여 출력
    // 9...0. 프로그램 종료하기

    public void selectAll() {}
    /*LibraryManager의 selectAll 메소드
호출
→ 결과 값을 Book[] 자료형으로 받
아준 뒤 for문을 통해 도서 전체 목록
출력*/
    Book[] blist = lm.selectAll();

    public void searchBook() {}
    /*검색할 제목 키워드를 입력 받고 그
키워드를 LibraryManager의
searchBook 메소드로 전달
→ 결과 값을 Book[] 자료형으로 받
아준 뒤 향상된 for문을 이용하여 출
력
*/
    // 1.키워드 입력 받고 2. LibraryManager의 searchBook()에 전달
    // 반환받은 값을
//    Book[] searchlist = lm.searchBook();


    public void rentBook() {}
    /*대여할 도서 인덱스를 입력 받아
LibraryManager의 rentBook 메소드로
전달
→ 결과 값을 result로 받아 result가
0일 경우, 1일 경우, 2일 경우 각각에
해당하는 출력문 출력
*/
    //Library Manager의 rentbook에 전달
    // 결과값을 result로 받고
    // 1. 0 > 성공출력
    // 2. 1 > 나이 제한 대여 불가
    // 3. 2 > 성공 대여 요리 학원 쿠폰 마이페이지 확인 출력


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


