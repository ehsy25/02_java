package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    public static int count = 0;
    private final ProductDTO[] pro = new ProductDTO[10];

    public void mainMenu() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=== 제품 관리 ===");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            int inp = sc.nextInt();
            sc.nextLine();

            switch (inp) {
                case 1:
                    produtInput();
                    break;

                case 2:
                    productPrint();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    break;
            }

        }
        while (flag);
    }

    public void produtInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 번호를 입력하세요 : ");
        int inp = sc.nextInt();
        sc.nextLine();
        System.out.print("제품명을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.print("제품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("제품 세금을 입력하세요 : ");
        int tax = sc.nextInt();
        sc.nextLine();
        pro[count] = new ProductDTO(inp, title, price, tax);

    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }

}
