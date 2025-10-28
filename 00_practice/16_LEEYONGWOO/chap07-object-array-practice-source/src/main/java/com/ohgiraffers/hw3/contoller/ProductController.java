package com.ohgiraffers.hw3.contoller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro=new ProductDTO[10];
    public int count;
    Scanner sc=new Scanner(System.in);

    public void mainMenu(){
        do {
            System.out.println("""
                    =====제품 관리 메뉴=====
                    1. 제품 정보 추기
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """);
          int tmp=sc.nextInt();

          if(tmp==1){
             productInput();
          }else if(tmp==2){
              productPrint();
          }else if(tmp==9){
              break;
          }

        }while(true);
    }


    public void productInput(){
        System.out.print("제품 번호 : ");
        int id=sc.nextInt();

        System.out.print("제품명 : ");
        String na=sc.next();

        System.out.print("제품 가격 : ");
        int pri=sc.nextInt();

        System.out.print("제품 세금 : ");
        double ta =sc.nextDouble();

        pro[count]=new ProductDTO(id,na,pri,ta);

        count++;
    }


    public void productPrint(){
        for(int i=0;i<count;i++){
            System.out.println(pro[i].information());
        }
    }

}
