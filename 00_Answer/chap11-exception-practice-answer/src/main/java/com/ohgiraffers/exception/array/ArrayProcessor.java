package com.ohgiraffers.exception.array;

public class ArrayProcessor {

    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException {
        if (index < 0 || index >= arr.length) {
            int maxIndex = arr.length - 1;
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0 ~ " + maxIndex + ")");
        }
        return arr[index];
    }
}
