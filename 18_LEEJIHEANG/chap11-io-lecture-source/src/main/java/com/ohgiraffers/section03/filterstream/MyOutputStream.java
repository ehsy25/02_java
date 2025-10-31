package com.ohgiraffers.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyOutputStream extends ObjectOutputStream {
    public MyOutputStream(OutputStream out) throws IOException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        super.writeStreamHeader();
    }

    // 써줄 때 문제가 생긴다.
    // 상속받아서 만들고 오버라이딩을 하는 것이다.
    // head 부분이 문제인 것이다. alt insert override method
    // writeStreamHeader
    // 정보를 받아서 쓰기도 하고
    // header 정보를 넣는 작업이기도 하다.
}
