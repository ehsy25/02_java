package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro = new ProductDTO[10];
    Scanner sc = new Scanner(System.in);

    public static int count;

    public void mainMenu(){
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
        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].getInformation());
        }
    }

    public void deleteProduct(int pid){
       deleteProduct(pid);
        System.out.println(pid + "제품 삭제 완료");
    }

    public void updateProduct(int pid, ProductDTO product){
        updateProduct(pid, product);
        System.out.println(pid + "제품 업데이트 완료");
    }

    public void searchProduct(int pid){
        searchProduct(pid);
        System.out.println(productPrint(pid) + "검색결과");

    }
}
