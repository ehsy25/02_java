package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] proudctDTO = null;
    public static int count = 0;
    Scanner sc = new Scanner(System.in);

    public ProductController() {
        proudctDTO = new ProductDTO[10];
    }

    public void mainMenu() {
        do {
            String menu = """
                    ========== 제품 관리 메뉴 ============
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    ==========================================
                    메뉴 선택 : """;
            System.out.print(menu);
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");;
            }
        } while (true);
    }

    public void productInput() {

        System.out.println("제품 입력 : ");
        String name = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        double tax = Double.parseDouble(sc.nextLine());

        ProductDTO productDTO = new ProductDTO(count, name, price, tax);
        proudctDTO[productDTO.getpId()] = productDTO;
    }

    public void productPrint() {
        for(int i = 0; i < count; i++) {
            System.out.println(proudctDTO[i].information());
        }
    }
}
