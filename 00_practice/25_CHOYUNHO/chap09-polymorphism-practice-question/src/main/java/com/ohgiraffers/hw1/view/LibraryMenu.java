package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        Member member = new Member(name,age,gender);
        lm.insertMember(member);

        String str = """
                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                
                """;
        int num;
        do{
            System.out.println(str);
            System.out.print("번호를 입력하시오 : ");
            num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1: lm.myInfo();break;
                case 2: selectAll();break;
                case 3: searchBook(); break;
                case 4: rentBook();break;
                case 0:
                    System.out.println("종료합니다."); break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }while(num!=0);
    }
    public void selectAll(){
        Book[] b = lm.selectAll();
        for(int i=0;i<b.length;i++){
            System.out.println(i+"번 "+b[i].toString());
        }
    }
    public void searchBook(){
        System.out.print("검색할 제목 키워드 : ");
        String str = sc.nextLine();
        Book [] b =lm.searchBook(str);
        for(Book b1:b){
            if(b1 != null){
                System.out.println(b1);
            }

        }
    }

    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int num = sc.nextInt();
        lm.rentBook(num);
        int result =lm.rentBook(num);
        if(result==0){
            System.out.println("성공적으로 대여되었습니다.");
        }else if(result==1){
            System.out.println("나이 제한으로 대여 불가능입니다.");
        }else{
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }
}
