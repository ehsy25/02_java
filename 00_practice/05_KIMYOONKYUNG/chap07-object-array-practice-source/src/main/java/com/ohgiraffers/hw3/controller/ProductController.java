package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;
import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro;
    private int count = 0;
    private Scanner sc = new Scanner(System.in);


    {
        pro = new ProductDTO[10];
    }


    public void mainMenu() {
        int menu;
        do {
            System.out.println("\n===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");   // productInput() 메소드 실행
            System.out.println("2. 제품 전체 조회");   // productPrint() 메소드 실행
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");


            if(sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine(); // 버퍼 비우기

                switch (menu) {
                    case 1:
                        productInput();
                        break;
                    case 2:
                        productPrint();
                        break;
                    case 9:
                        System.out.println("프로그램 종료");
                        return;
                    default:
                        System.out.println("없는 번호");
                }
            } else {
                System.out.println("번호입력 다시해주세요");
                sc.next();
                menu = 0;
            }
        } while (menu != 9);
    }


    public void productInput() {

        if (count >= pro.length) {
            System.out.println("더 이상 제품을 추가할 수 없습니다. (최대 " + pro.length + "개)");
            return;
        }

        System.out.println("\n--- 제품 정보 입력 ---");
        System.out.print("제품 번호: ");
        int pId = sc.nextInt();
        sc.nextLine();

        System.out.print("제품명: ");
        String pName = sc.nextLine();

        System.out.print("제품 가격: ");
        int price = sc.nextInt();

        System.out.print("제품 세금 (예: 0.1): ");
        double tax = sc.nextDouble();
        sc.nextLine();


        ProductDTO newProduct = new ProductDTO(pId, pName, price, tax);


        pro[count] = newProduct;
        count++;

        System.out.println("추가 (현재 제품 수: " + count + ")");
    }


    public void productPrint() {
        if (count == 0) {
            System.out.println("등록된 제품 정보가 없습니다.");
            return;
        }

        System.out.println("\n--- 등록된 제품 전체 정보 (" + count + "개) ---");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + pro[i].information());
        }
    }
}


/*package com.ohgiraffers.hw3.controller;

import java.util.Scanner;
import com.ohgiraffers.hw3.model.dto.ProductDTO;


public class ProductController {

    private ProductDTO[] pro = new ProductDTO[10];

    public static int count = 0; //밑줄은 static

    Scanner sc = new Scanner(System.in);

    {
        pro = new ProductDTO[10];

        //초기화 블럭을 {}로만 해도 된다!!
    }

    public void mainMenu() {
        int menu = 0;

        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료 ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    productInput();
                    break;

                case 2:
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("없는 번호");

            }

        } while (menu != 9);

    }

    public void productPrint() {
        if (count == pro.length) {
            System.out.println("추가 안됨");
            return;


            System.out.println("\n--- 제품 정보 입력 ---");
            System.out.print("제품 번호: ");
            int pId = sc.nextInt();
            sc.nextLine();

            System.out.print("제품명: ");
            String pName = sc.nextLine();

            System.out.print("제품 가격: ");
            int price = sc.nextInt();

            System.out.print("제품 세금 (예: 0.1): ");
            double tax = sc.nextDouble();
            sc.nextLine();

            ProductDTO newProduct = new ProductDTO(pId, pName, price, tax);

            pro[count] = newProduct;
            count++;

            System.out.println(" 제품 정보가 성공적으로 추가되었습니다! (현재 제품 수: " + count + ")");
    }
}


        // 제품 전체 출력
        public void productPrint() {
            if (count == 0) {
                System.out.println("등록된 제품 정보가 없습니다.");
                return;
            }

            System.out.println("\n--- 등록된 제품 전체 정보 (" + count + "개) ---");
            // 현재까지 기록된 제품 정보 모두 출력 (count 만큼 반복)
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + pro[i].information());
            }
        }
    }
            //인덱스에 생성한 주소 저장.->hash로 받는다xx
            // 배열에 저장할때는 hash가 아닌 참조(reference)로 저장!!!

        }


        // 키보드로 도서 정보를 입력 받아 객체 생성
        // -> Product 생성자 내부에서
        // ProductController의 count 클래스 변수 값이 1씩 증가
        // 현재 카운트 인덱스에 생성한 주소 저장
    }
    }
// /**
//     * 새로운 제품 정보를 입력 받아 객체를 생성하고 배열에 저장
//     */
//    public void productInput() {
//        // static 필드인 count를 사용하여 배열의 길이와 비교
//        if (count >= pro.length) {
//            System.out.println(" 제품 배열이 가득 찼습니다. 더 이상 추가할 수 없습니다. (최대 10개)");
//            return;
//        }
//
//        System.out.println("\n--- 제품 정보 추가 ---");
//        System.out.print("제품 번호 (정수): ");
//        int pId = sc.nextInt(); // default 필드 sc 사용
//        sc.nextLine();
//
//        System.out.print("제품명 (문자열): ");
//        String pName = sc.nextLine();
//
//        System.out.print("제품 가격 (정수): ");
//        int price = sc.nextInt();
//
//        System.out.print("제품 세금 (예: 0.15): ");
//        double tax = sc.nextDouble();
//        sc.nextLine();
//
//        // Product 객체 생성 및 배열의 현재 count 인덱스에 주소 저장
//        pro[count] = new ProductDTO(pId, pName, price, tax);
//        count++; // static 필드 count 값 1 증가
//
//        System.out.println(" 제품 정보가 성공적으로 추가되었습니다. (현재 " + count + "개)");
//    }
//
//    /**
//     * 현재까지 기록된 제품 정보 모두 출력
//     */
//    public void productPrint() {
//        System.out.println("\n--- 제품 전체 조회 ---");
//        // static 필드 count 사용
//        if (count == 0) {
//            System.out.println("조회할 제품 정보가 없습니다.");
//            return;
//        }
//
//        for (int i = 0; i < count; i++) {
//            System.out.println(pro[i].information());
//        }
//        System.out.println("총 " + count + "개의 제품이 기록되어 있습니다.");
//    }
//}







//count를 기본변수에 넣고, Dto에 id를 넣는다.

//arrs = arrs [10]

//private pro ProductDTO[]

// static이라고 들었는뎅 밑줄친거, 물결(~)은 디폴트!!
//Scanner sc = 물

//  public void mainMenu() {}     // -- 사용완료
