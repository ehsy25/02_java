package com.ohgiraffers.exception.array;

public class ArrayProcessor {
    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException{
        if(arr.length <= index){
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0~ [" + index + "])");
        }
        else {
            return arr[index];
        }
    }
}
