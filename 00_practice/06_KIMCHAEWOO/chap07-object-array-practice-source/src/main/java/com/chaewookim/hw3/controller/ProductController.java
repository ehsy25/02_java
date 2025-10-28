package com.chaewookim.hw3.controller;

import com.chaewookim.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro = new ProductDTO[10];

    public static int count;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        int input = 0;

        String menu = """
                ===== 제품 관리 메뉴 =====
                1. 제품 정보 추가
                2. 제품 전체 조회
                9. 프로그램 종료
                """;

        do {
            System.out.println(menu);

            System.out.print("입력: ");
            input = sc.nextInt();

            switch (input) {
            case 1:
                productInput(); break;
            case 2:
                productPrint(); break;
            default:
                System.out.println("틀린 숫자"); break;
            }
        }
        while (input != 9);

    }

    public void productInput() {
        System.out.print("pid: ");
        int pid = sc.nextInt();
        sc.nextLine();
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("price: ");
        int price = sc.nextInt();
        System.out.print("tax: ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pid, name, price, tax);

        count++;

    }

    public void productPrint() {
//        for (ProductDTO j : pro) {
//            System.out.println(j.information());
//        }

        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
