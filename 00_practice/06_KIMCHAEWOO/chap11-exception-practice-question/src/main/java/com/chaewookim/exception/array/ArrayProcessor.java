package com.chaewookim.exception.array;

public class ArrayProcessor {

    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException {

        if (index < 0 || index > arr.length-1) {
            throw new ArrayLengthException("유효하지 않은 인덱스. (범위: 0 ~ " + (arr.length-1) + ")");
        } else {
           return arr[index];
        }
    }
}
