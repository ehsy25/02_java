package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro;
    public static int count;
    Scanner sc;

    {
        pro = new ProductDTO[10];
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        int choice ;
        do {
            System.out.print("===== 제품 관리 메뉴 ======\n" +
                    "1. 제품 정보 추가\n" +
                    "2. 제품 전체 조회\n" +
                    "9. 프로그램 종료\n" +
                    ">>> 메뉴 번호를 입력하세요 : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productInput(); break;
                case 2:
                    productPrint(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("올바른 번호를 입력하세요."); break;
            }
        } while (choice != 9);
    }
    public void productInput() {

        System.out.print("제품번호: ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품명: ");
        String pName = sc.nextLine();
        System.out.print("제품가격: ");
        int price = sc.nextInt();
        System.out.print("제품세금: ");
        double tax = sc.nextDouble();

        pro[ProductController.count] = new ProductDTO(pId, pName, price, tax);
    }
    public void productPrint() {
        System.out.println("===== 제품 정보 출력 =====");
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }
}
