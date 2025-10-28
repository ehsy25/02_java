package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;


import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm =  new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();  //버퍼에 남은 개행문자 초기화
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        Member member = new Member(name,age,gender);

        // LibraryManager의 insertMember() 메소드에 전달
        lm.insertMember(member);

        //메뉴 들어가기
        outer : while(true){
            //메뉴선택 입력받기
            System.out.print("메뉴 선택 입력\n" +
                    "1. 마이페이지 \n" +
                    "2. 도서 전체 조회 \n" +
                    "3. 도서 검색 \n" +
                    "4. 도서 대여하기 \n" +
                    "0. 프로그램 종료하기 ");
            int num = sc.nextInt();
            sc.nextLine(); // 버퍼 초기화
            switch (num){
                case 1:  System.out.println(lm.myInfo()); break; //마이페이지
                case 2: selectAll(); break;  //도서 전체 조회
                case 3: searchBook(); break; //도서 검색
                case 4: rentBook();  break;  //도서 대여하기
                case 0: //프로그램 종료
                    System.out.println("프로그램 종료"); break outer;
            }
        }
    }

    public void selectAll(){
        // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
        Book[] bList = lm.selectAll();

        // for문 이용하여 bList의 모든 도서 목록 출력
        //단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
        for(int i = 0; i < bList.length; i++){
            System.out.println(i + "번 도서 : " + bList[i].toString());
        }

    }

    public void searchBook(){
        // “검색할 제목 키워드 : “  >> 입력받기
        System.out.print(" 검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        // LibraryManager의 searchBook() 에 전달
        // 그 결과 값을 Book[] 자료형에 담기
        Book[] searchList = lm.searchBook(keyword);

        ///   NullPointerException 발생 시


        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
        for(Book b : searchList){
            if(b != null){
                System.out.println(b.toString());
            }
        }
    }

    public void rentBook(){
        // 도서대여를 위해 도서번호를 알아야된다
        selectAll();

        //도서 번호 입력받기
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();

        // LibraryManager의 rentBook() 에 전달
        int result = lm.rentBook(index);
        switch (result){
            case 0 :
                System.out.println("성공적으로 대여되었습니다."); break;
            case 1 :
                System.out.println("나이 제한으로 대여가 불가능입니다"); break;
            case 2 :
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다"
                + "마이페이지를 통해 확인하세요");
        }


    }



    //getter/setter

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
