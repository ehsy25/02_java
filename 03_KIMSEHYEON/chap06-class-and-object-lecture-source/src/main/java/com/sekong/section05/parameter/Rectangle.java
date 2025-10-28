package com.sekong.section05.parameter;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {//기본생성자
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calArea(){
        System.out.println("사각형의 넓이는 " + (this.width * this.height));
    }
    public void calRound(){
        System.out.println("사각형의 둘레는 "+ (this.width + this.height)*2);
    }
}
