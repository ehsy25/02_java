package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    ProductDTO[] pro = new ProductDTO[10];
    public static int count = 0;

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        while (true) {
            String menu = """
                    ========== 회원 관리 프로그램 ============
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    ==========================================
                    메뉴 선택 : """;
            System.out.print(menu);
            int no = sc.nextInt();

            switch (no) {
            case 1: productinput(); break;
            case 2: productPrint(); break;
            case 9:
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");;
            }
        }
    }

    public void productinput() {
        System.out.print("제품 번호 : ");
        int pid = sc.nextInt();
        System.out.print("제품명 : ");
        String pName = sc.next();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] =  new ProductDTO(pid, pName, price, tax);
    }

    public void productPrint() {
        for(int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
