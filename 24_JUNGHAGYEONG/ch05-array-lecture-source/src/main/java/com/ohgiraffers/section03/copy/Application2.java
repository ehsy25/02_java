package com.ohgiraffers.section03.copy;

import java.util.Arrays;
import java.util.Objects;

public class Application2 {

    public static void main(String[] args) {

        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 깊은 복사 */
        /* 1. for문 */
        int[] copy = new int[10];
        for (int i = 0; i < origin.length; i++) {
            copy[i] = origin[i];
        }
        System.out.println("============== original ===============");
        print(origin);
        System.out.println("============== copy1 ===============");
        print(copy);

        Object b = new Object();
        /* 2. Object의 clone메소드
        * > 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성됨.
        * */
        int[] copy2 = origin.clone();
        System.out.println("============== copy2 ===============");
        print(copy2);

        /* 3. System의 arraycopy 메소드
        *  arrycopy(원본배열, 복사를 시작할 인덱스, 복사본배열, 복사를 시작할 인덱스, 복사할 길이)
        * */
        int[] copy3 = new int[10];
        System.arraycopy(origin, 0, copy3, 3, origin.length);
        System.out.println("============== copy3 ===============");
        print(copy3);

        /* 4. Arrays의 copyOf 메소드 : 원본의 처음부터만 가능 */
        int[] copy4 = Arrays.copyOf(origin, 7);
        int[] copy5 = Arrays.copyOf(origin, 3);
        System.out.println("============== copy4 ===============");
        print(copy4);
        System.out.println("============== copy5 ===============");
        print(copy5);

    }

    /***
     * 전달받은 배열의 주소값, 값을 출력하는 용도의 메소드
     * @param arr 배열의 주소값
     */
    public static void print(int[] arr) {
        System.out.println("arr.hashCode() : " + arr.hashCode());
        System.out.println("arr : " + Arrays.toString(arr));
    }
}
