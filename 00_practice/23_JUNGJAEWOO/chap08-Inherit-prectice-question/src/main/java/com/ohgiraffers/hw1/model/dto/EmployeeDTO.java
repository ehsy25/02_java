package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }
    public EmployeeDTO(String name, int age, double weight, double height, int salary, String dept) {
        super(age, weight, height);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
