package com.chaewookim.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int age, double height, double weight, int salary, String dept, String name) {
        super(age, height, weight);
        this.salary = salary;
        this.dept = dept;

        super.name = name;
    }

    public String information() {
        return "EmployeeDTO{" +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
