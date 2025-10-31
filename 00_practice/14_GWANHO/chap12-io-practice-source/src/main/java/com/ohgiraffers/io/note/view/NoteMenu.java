package com.ohgiraffers.io.note.view;

import com.ohgiraffers.io.note.controller.FileController;

import java.util.Scanner;

public class NoteMenu {

    public void viewMenu() {
        Scanner sc = new Scanner(System.in);
        FileController fc = new FileController(); // 컨트롤러 객체 생성

        do {
            String menu = """
                    ****** MyNote ******
                    1. 노트 새로 만들기
                    2. 노트 열기
                    3. 노트 열어서 수정하기
                    4. 끝내기
                    번호를 입력하세요 :
                    프로그램을 종료합니다.
                    잘못 입력하셨습니다.
                    메뉴 선택 : """;
            System.out.print(menu);

            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    fc.filesave();
                    break;
                case 2:
                    fc.fileopen();
                    break;
                case 3:
                    fc.fileEdit();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다");;
            }
        } while (true);
    }
}
