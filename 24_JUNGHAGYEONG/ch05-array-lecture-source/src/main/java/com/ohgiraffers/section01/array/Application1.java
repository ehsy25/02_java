package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {

        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];
        System.out.println(arr);

        /* 하나의 이름으로 관리되는 연속 된 메모리 공간이며, 해당 공간에 접근 시에는 인덱스 사용함. */
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        /* 인덱스를 반복문으로 처리 가능 */
        /*arr.length : 배열의 공간의 갯수를 알 수 있음*/
        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        System.out.println("");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);

        /*
        * 향상됨 for문
        * for(한 번의 반복문에서 사용될 변수: 반복을 수행할 배열)
        *
        * 배열 인덱스에 담긴 값을 꺼내 int i 라는 병수로 옮겨 담아서 사용하는 맥락으로
        * i 변수에 값을 대입하더라도 배열 인덱스의 값은 변경 XX
        * >> 배열 인덱스의 값을 변경하고자 할때는 사용 불가능
        * */

        for (int i : arr) {
            System.out.println("i = " + i);
            i = 0;
        }

        System.out.println("");

        for (int i : arr) {
            System.out.println("i = " + i);
        }

    }
}
