package com.sekong.hw3.controller;
import com.sekong.hw3.model.dto.*;

import java.util.Arrays;
import java.util.Scanner;

public class ProductController {
    private ProductDTO[] productDTO = new ProductDTO[10];
    public static int count;
    Scanner sc = new Scanner(System.in);

    public  void mainMenu(){
        boolean flag = true;
        do{
            String msg = """
                    ==== 제품 관리 메뉴 ====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료""";
            System.out.println(msg);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("mainmenu");
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while(flag);
    }
    public void productInput(){
        System.out.println("Input call");
        productDTO[count] = new ProductDTO();
        System.out.print("제품 번호 : ");
        productDTO[count-1].setpId(sc.nextInt());
        sc.nextLine();
        System.out.print("제품명 : ");
        productDTO[count-1].setpName(sc.nextLine());
        System.out.print("제품 가격 : ");
        productDTO[count-1].setPrice(sc.nextInt());
        System.out.print("제품 세금 : ");
        productDTO[count-1].setTax(sc.nextDouble());

    }
    public void productPrint(){
        for(int i=0;i<ProductController.count;i++){
            String msg = "Id : " + productDTO[count-1].getpId()
                    + "Name : " + productDTO[count-1].getpName()
                    + "Price : " + productDTO[count-1].getPrice()
                    + "Tax : " + productDTO[count-1].getTax();
            System.out.println(msg);
        }
    }


}
