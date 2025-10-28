package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{

    //필드
    private int salary;
    private String dept;

    //
    public EmployeeDTO() {}
    public EmployeeDTO(String name, int age, double height,
                       double weight, int salary, String dept) {
        super(age, height, weight);
        setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    //getter

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    //setter

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //information
    public String information() {
        return super.information() +
                ", salary=" + salary +
                ", dept=" + dept + " " +
                ']';
    }
}
