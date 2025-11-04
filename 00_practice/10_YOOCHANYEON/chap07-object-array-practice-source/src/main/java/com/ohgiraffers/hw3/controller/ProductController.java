package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    ProductDTO[] pd;
    private static int count;

    {
        pd = new ProductDTO[10];
        count = 0;
    }

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        int input = 0;
        do{
            System.out.println("""
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """);
            input = sc.nextInt();

            switch (input) {
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 9:
                    System.out.println("프로그램 종료");break;
                default:
                    System.out.println("올바른 선택을 하시길 바랍니다?"); break;
            }
        } while (input != 9);
    }

    public void productInput() {
            System.out.print("제품 번호 : ");
            int pid = sc.nextInt();
            System.out.print("제품 명 : ");
            String blank = sc.nextLine();
            String name = sc.nextLine();
            System.out.print("제품 가격 : ");
            int price = sc.nextInt();
            System.out.print("제품 세금 : ");
            double tax = sc.nextDouble();

            pd[count] = new ProductDTO(pid, name, price, tax);
            count++;
    }

    public void productPrint() {
        for(int i = 0; i < count; i++) {
            System.out.println(pd[i].info());
        }
    }
}
