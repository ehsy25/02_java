package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro;
    public int count;
    Scanner sc = new Scanner(System.in);

    {
        pro = new ProductDTO[10];
        count = 0;
    }
    public void mainMenu() {
        int num;
        do {
            String menu = """
                ===== 제품 관리 메뉴 =====
                1. 제품 정보 추가
                2. 제품 전체 조회
                9. 프로그램 종료
                """;
            System.out.println();
            System.out.println(menu);
            System.out.print("메뉴 선택 : ");
            num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1: productInput();
                    break;
                case 2: productPrint();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }

        } while (num != 9);
    }

    public void productInput() {

        System.out.print("제품 번호 : ");
        int productNum = sc.nextInt();
        sc.nextLine();

        System.out.print("제품명 : ");
        String productName = sc.nextLine();

        System.out.print("제품 가격 : ");
        int productPrice = sc.nextInt();

        System.out.print("제품 세금 : ");
        double productTax = sc.nextDouble();

        pro[count++] = new ProductDTO(productNum, productName, productPrice, productTax);

    }

    public void productPrint() {
        if (count == 0){
            System.out.println("등록된 제품 XX");
        }
        System.out.println("\n===== 등록된 제품 목록 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }

}
