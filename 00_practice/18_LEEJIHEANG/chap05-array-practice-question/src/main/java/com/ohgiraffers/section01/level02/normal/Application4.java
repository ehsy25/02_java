package com.ohgiraffers.section01.level02.normal;

public class Application4 {
    public static void main() {

        int[] lotto = new int[6];
        int index = 0;
        while (index < lotto.length) {
            int randomNum = (int) (Math.random() * 45) + 1;
            boolean isDuplicate = false;
            for (int i = 0; i < index; i++) {
                if (lotto[i] == randomNum) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                lotto[index] = randomNum;
                index++;
            }

            }
        System.out.print("로또 번호 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + (i == lotto.length - 1 ? "" : ","));
        }
    }
}

//    public static void main(String[] args) {
//
//     /*
//		  로또 번호 자동 생성기 프로그램을 작성하세요.
//		  단, 중복 값 없이 출력하세요.
//
//		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
//	   */
//        //  총 45개 중에서 6개 뽑기
//        int[] array = {1, 2, 3, 4, 5, 6};
////        1에서 45까지의 수
//        int a = (int) (Math.random()*45)+1;
//        int b = (int) (Math.random()*45)+1;
//        int c = (int) (Math.random()*45)+1;
//        int d = (int) (Math.random()*45)+1;
//        int e = (int) (Math.random()*45)+1;
//        int f = (int) (Math.random()*45)+1;
//
////        int i = 0;
////        for (int = 0 ; i < array.length; i++);
//
//        array[0] = a;
//        array[1] = b;
//        array[2] = c;
//        array[3] = d;
//        array[4] = e;
//        array[5] = f;
//        System.out.print(array[0] + " ");
//        System.out.print(array[1] + " ");
//        System.out.print(array[2] + " ");
//        System.out.print(array[3] + " ");
//        System.out.print(array[4] + " ");
//        System.out.print(array[5] + " ");
//
//
//
//
//
//    }
//}
