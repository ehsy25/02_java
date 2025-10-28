package com.ohgiraffers.section01.level02.normal;

/* import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {


		  로또 번호 자동 생성기 프로그램을 작성하세요. // 1~45
		  단, 중복 값 없이 출력하세요. // ...???

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용

int[] lotto = new int[6]; //로또 번호는 6개
int count = 0; // 배열에 넣고 count증가


        while (count < 6) { //6개 다 안채우면 계속 난수 생성
int num = (int)(Math.random() * 45) + 1;
            if (!contains(lotto, num, count)) { //contains?!?!?!!? 이걸 boolean에서~
// 배열lotto에 이미 뽑힌 num이 있는지 확인
lotto[count] = num;
count++; //배열에 난수 하나 넣으면 count 1 증가
        }

        }
        Arrays.sort(lotto);
        System.out.println("번호" + Arrays.toString(lotto));

private static boolean contains(int[] arr, int num, int length) {
    //이부분 몰겠어요ㅠ유유ㅠ유ㅠ유유유ㅠㅠ
    for (int i = 0; i < length; i++) {
        if (arr[i] == num)  return true;
    }
    return false;
}
}


 */

import java.util.Arrays;

public class Application4 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int count = 0;

        while (count < 6) {
            int num = (int)(Math.random() * 45) + 1; // 1~45 난수
            if (!contains(lotto, num, count)) {
                lotto[count] = num;
                count++;
            }
        }

        Arrays.sort(lotto);
        System.out.println("생성된 로또 번호: " + Arrays.toString(lotto));
    }

    public static boolean contains(int[] arr, int num, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }
}

//봐도 몰겠어서 일단 지피티 복붙........ㅜㅜㅜㅜㅜㅜㅜㅜㅜ

