package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    ProductDTO[] pro  = new ProductDTO[10];

    public int count = 0;



    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            String menu = """
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    
                    """;
            System.out.println(menu);
            System.out.print("번호 입력 : ");
            num = sc.nextInt();
            switch (num){
                case 1 : productInput(); break;

                case 2 : productPrint(); break;

                case 9 :
                    System.out.println("종료합니다"); break;

                default:
                    System.out.println("잘못된 값을 입력"); break;




            }
        }while(num != 9);
    }
    public void productInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("pid : ");
        int pid = sc.nextInt();
        sc.nextLine();
        System.out.print("pName : ");
        String pName = sc.nextLine();
        System.out.print("price : ");
        int price = sc.nextInt();
        System.out.print("tax : ");
        double tax = sc.nextDouble();
        pro[count] =new ProductDTO(pid,pName,price,tax);
        count++;

    }
    public void productPrint(){
        for(int i=0;i<count;i++){
            String str = pro[i].information();
            System.out.println("ProductDTO["+i+"} : "+str);
        }
    }

}

