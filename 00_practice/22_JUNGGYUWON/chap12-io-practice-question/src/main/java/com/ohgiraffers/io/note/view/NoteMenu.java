package com.ohgiraffers.io.note.view;

import com.ohgiraffers.io.note.controller.FileController;

import java.util.Scanner;


public class NoteMenu {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        FileController fc = new FileController(); // 컨트롤러 객체 생성
        boolean flag = true;
        String menu = """
                 ****** MyNote ******
                 1. 노트 새로 만들기
                 2. 노트 열기
                 3. 노트 열어서 수정하기
                 4. 끝내기
                 번호를 입력하세요 : """;

        while (flag) {
            System.out.print(menu);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    fc.fileSave();
                    break;
                    case 2:
                        fc.filOpen();
                        break;
                        case 3:
                            fc.fileEdit();
                            break;
                            case 4:
                                System.out.println("프로그램을 종료합니다.");
                                flag=false;
                                break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }

    }
}