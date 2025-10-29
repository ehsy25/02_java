package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();

        run.test4();

    }

    public void test4() {
        ArrayProcessor arrayP = new ArrayProcessor();
        Scanner sc =  new Scanner(System.in);
        System.out.print("인덱스 값을 입력하세요[0-2] : ");
        int inputIdx = sc.nextInt();
        int [] intArr = {0, 1, 2};

        try {
            int idx = arrayP.getElementAtIndex(intArr,inputIdx);
            System.out.println("인덱스 "+inputIdx+"의 값은 "+idx+"입니다.");
        } catch (ArrayLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
