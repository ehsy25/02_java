package com.ohgiraffers.exception.array;

import com.ohgiraffers.exception.charcheck.CharCheckException;

public class ArrayProcessor {

    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException {

        if(index >= 0 && index < arr.length){
            return index;
        } else {
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0 ~ [최대 인덱스])");
        }
    }
}
