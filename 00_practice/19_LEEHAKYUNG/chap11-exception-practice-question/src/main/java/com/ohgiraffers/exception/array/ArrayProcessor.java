package com.ohgiraffers.exception.array;

public class ArrayProcessor {

    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException{
        int max = arr.length - 1;
        if (index < 0 || index > max){
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0 ~ " + max + ")");
        }
        return arr[index];
    }
}
