package com.E.section05.parameter;

public class Rectangle {

    private int l;
    private int w;

    public Rectangle() {
    }

    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public void area(){
        System.out.println("Area of rectangle: " + l*w);
    }

    public void perimeter(){
        System.out.println("Perimeter of rectangle: " + ((l+w)*2));
    }



}


