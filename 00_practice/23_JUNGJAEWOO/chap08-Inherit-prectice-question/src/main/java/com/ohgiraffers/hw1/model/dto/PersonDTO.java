package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double weight;
    private double height;

    public PersonDTO() {
    }

    public PersonDTO(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
