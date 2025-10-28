package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro = new ProductDTO[10];
    public static int count;
    private int choice;
    protected Scanner sc = new Scanner(System.in);;

    public void mainMenu(){
        do {
            System.out.print("""
                    === 제품 관리 정보 ===
                    1. 제품 정보 추가 
                    2. 제품 전체 조회
                    9. 프로그램 종료 : """);
            choice = sc.nextInt();
            if (choice == 1) {
                productInput();
            } else if (choice == 2) {
                productPrint();
            }
        } while (choice != 9);

    }
    public void productInput(){
        System.out.print("도서 정보를 입력해주세요 : ");
        int pld = sc.nextInt();
        String pName = sc.next();
        int price = sc.nextInt();
        double tax = sc.nextDouble();

        pro[count++] = new ProductDTO(pld, pName, price, tax);

    }
    public void productPrint(){
        for(int i = 0; i < count; i++){
            System.out.println(pro[i].toString());
        }
    }

}
