package com.ohgiraffers.hw3.model.dto;

import java.util.Scanner;

public class ProductController {

public int count = 0;

Scanner sc = new Scanner(System.in);

private boolean go = true;

private static ProductDTO[] ps;
    static {
        ps = new ProductDTO[10];
    }

ProductDTO p =  new ProductDTO();

public void mainMenu(){
do{
    System.out.println("""
            메뉴 선택지
            1. 제품 추가
            2. 정보 출력
            9. 자폭
            
            """);

    int input = sc.nextInt();

    switch(input){
        case 1:
            productInput();
            break;
            case 2:productPrint();
            break;
            case 9:go = false;
            break;
    }
}
    while(go);
}

public void productInput(){

    System.out.println("제품 번호");
    int pid = sc.nextInt();
    System.out.println("제품명");
    String pname = sc.next();
    System.out.println("가격");
    int price = sc.nextInt();
    System.out.println("세금");
    double tax = sc.nextDouble();

    ps[count++] = new ProductDTO(pid,pname,price,tax);

}

public void productPrint(){
    for(int i=0; i<=count-1; i++){
        System.out.println(ps[i].information());
    }
}


}
