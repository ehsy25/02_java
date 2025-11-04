package com.E.hw2.view;

import com.E.hw2.controller.BoardManager;
import com.E.hw2.model.comparator.AscBoardNo;
import com.E.hw2.model.comparator.DescBoardNo;
import com.E.hw2.model.dto.BoardDTO;

import java.util.Comparator;
import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm = new BoardManager();
    private InputBoard ib =  new InputBoard();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        boolean on = true;
bm.set();
        while(on){
            System.out.println("""
                    *** 게시글 서비스 프로그램 ***
                    1. 게시글 쓰기 // insertBoard(inputBoard()이 리턴한 객체) 실행
                    2. 게시글 전체보기 // selectAllList() 실행
                    3. 게시글 한 개보기 // selectOneBoard(inputBoardNo()) 실행
                    4. 게시글 제목 수정 // updateBoardTitle(inputBoardNo(),inputBoardTitle()) 실행
                    5. 게시글 내용 수정 // updateBoardContent(inputBoardNo(),inputBoardContent()) 실행
                    6. 게시글 삭제 // deleteBoard(inputBoardNo()) 실행
                     7. 게시글 제목 검색 // searchBoard(inputBoardTitle()) 실행
                     8, 정렬하기 // sortSubMenu() 실행
                     9. 끝내기 // “프로그램이 종료되었습니다.” 출력
                    메뉴 번호 선택 : >> 입력 받음
                   """);
            int input = sc.nextInt();
            switch(input){
                case 1:bm.insertBoard(ib.InputBoard());
                break;
                case 2:bm.selectAllList();
                break;
                case 3:bm.selectOneBoard(ib.InputBoardNo());
                break;
                case 4:bm.updateBoardTitle(ib.InputBoardNo(),ib.InputBoardTitle());
                    break;
                case 5:bm.updateBoardContent(ib.InputBoardNo(),ib.InputBoardContent());
                    break;
                case 6:bm.deleteBoard(ib.InputBoardNo());
                    break;
                case 7:bm.searchBoard(ib.InputBoardNo());
                    break;
                case 8:sortSubMenu();
                    break;
                case 9:on = false;
                break;
            }
        }
    }

    public void sortSubMenu() {
        Scanner sc2 = new Scanner(System.in);

        while (true) {
            System.out.println("***** 게시글 정렬 메뉴 *****");
            System.out.println("1. 글번호순 오름차순 정렬"); // sortList(AscBoardNo())
            System.out.println("2. 글번호순 내림차순 정렬"); // sortList(DescBoardNo()) [cite: 79]
            System.out.println("3. 작성날짜순 오름차순 정렬"); // sortList(AscBoardDate()) [cite: 80]
            System.out.println("4. 작성날짜순 내림차순 정렬"); // sortList(DescBoardDate()) [cite: 81]
            System.out.println("5. 글제목순 오름차순 정렬"); // sortList(AscBoardTitle()) [cite: 82]
            System.out.println("6. 글제목순 내림차순 정렬"); // sortList(DescBoardTitle()) [cite: 83]
            System.out.println("7. mainMenu()메소드로 이동"); // [cite: 84]

            if (!sc2.hasNextInt()) {
                sc2.nextLine();
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }
            int menu = sc2.nextInt();
            sc.nextLine();

            Comparator<BoardDTO> comparator = null;
            switch (menu) {
                case 1:bm.sortList(new AscBoardNo());
                break;
                case 2:bm.sortList(new DescBoardNo());
                break;
                
            }
        }
    }
}