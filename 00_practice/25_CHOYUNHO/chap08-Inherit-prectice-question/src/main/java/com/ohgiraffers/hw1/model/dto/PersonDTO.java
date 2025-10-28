package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double height;
    private double weigth;

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double weigth) {
        this.age = age;
        this.height = height;
        this.weigth = weigth;
    }

    public String information(){
        return
                "weigth=" + weigth +
                ", height=" + height +
                ", age=" + age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}


