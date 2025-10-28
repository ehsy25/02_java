package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro = new ProductDTO[10];

    public static int count = 0;

    Scanner sc = new Scanner(System.in);

    int num = 0;
    public void mainMenu(){
        do{
            String text = """
                    ==========제품 관리 메뉴=============
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    입력 : """;
            System.out.print(text);

            num =  sc.nextInt();
            switch (num){
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다."); break;
                        default:
                            System.out.println("똑바로 입력해라잉?");break;
            }
        }while( num != 9);
    }
    public void productInput(){

        pro[count] = new ProductDTO();

        System.out.print("제품 번호 : ");
        pro[count-1].setpId(sc.nextInt());
//        int pid = sc.nextInt();
        System.out.print("제품명 : ");
        sc.nextLine();
        pro[count-1].setpName(sc.nextLine());
        sc.nextLine();
//        String name = sc.nextLine();
        System.out.print("제품 가격 : ");
        pro[count-1].setPrice(sc.nextInt());
//        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
//        double tax = sc.nextDouble();
        pro[count-1].setTax(sc.nextDouble());


//        pro[count] = new ProductDTO(pid, name, price, tax);
    }
    public void productPrint(){
        for(int i = 0; i < count; i++){
            System.out.println(pro[i].information());
        }
    }

}