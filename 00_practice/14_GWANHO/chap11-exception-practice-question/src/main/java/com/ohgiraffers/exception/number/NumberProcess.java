package com.ohgiraffers.exception.number;

public class NumberProcess {

    public NumberProcess() {

    }

    public boolean checkDouble(int a, int b) throws NumberRangeException {
        if(!Between1to100(a) || !Between1to100(b)) {
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        }
        return b % a == 0;
    }

    public boolean Between1to100(int number) {
        return (number >= 1 && number <= 100);
    }
}
