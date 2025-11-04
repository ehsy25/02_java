package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    //필드
    private ProductDTO[] productDtos = new ProductDTO[10];
    public static int count = -1;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        do {
            System.out.println("""
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    3. 제품 삭제
                    9. 프로그램 종료
                    =======================
                    """);
            int op = sc.nextInt();

            switch (op) {
                case 1: //제품 정보 추가
                    productInput(); break;
                case 2: //제품 전체 조회
                    productPrint(); break;
                case 3:
                    productDelete(); break;
                case 9:
                    System.out.println("관리시스템 종료");
                    System.exit(0);
                default:
                    System.out.print("잘못된 번호를 누르셨습니다.");
                    break;
            }


        } while (true);
    }

    private void productDelete() {
        System.out.print("삭제하고 싶은 제품번호를 입력하세요 : ");
        int op =  sc.nextInt();
        int isDeleted = 0;
        for (int i = 0; i <= ProductController.count; i++) {
            if ( productDtos[i].getPid() == op ) {
                productDtos[i] = null;
                isDeleted = 1;
                ProductController.count--;
            }
        }
        if (isDeleted == 1) {
            System.out.println("제품이 성공적으로 삭제되었습니다.");
        } else {
            System.out.println("제품이 없습니다.");
        }
    }

    public void productInput() {
        if ( ProductController.count > 9 ) {
            System.out.println("더 이상 제품 정보를 입력할 수 없습니다." +
                    "제품을 삭제한 후 등록해주세요.");
            return;
        }

        ProductController.count ++; // 제품 개수 추가
        System.out.print("제품 정보를 입력해주세요 : ");
        int pid = sc.nextInt();
        String nName = sc.next();
        int price =  sc.nextInt();
        double tax = sc.nextDouble();
        productDtos[ProductController.count] = new ProductDTO(
                pid,nName,price,tax);
        System.out.println("count: " + ProductController.count);

    }

    public void productPrint() {
        if (ProductController.count ==-1) {
            System.out.println("제품이 없습니다. 제품을 등록해주세요.");
            return;
        }
        for ( int i = 0; i <= ProductController.count ; i++ ) {
            if ( productDtos[i] == null ) {
                continue;
            }
            System.out.println(productDtos[i].information());
        }
    }
}
