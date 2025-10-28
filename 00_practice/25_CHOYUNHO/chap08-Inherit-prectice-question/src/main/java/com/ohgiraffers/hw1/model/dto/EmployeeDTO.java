package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary;
    private String dept;

    public EmployeeDTO(){};

    public EmployeeDTO(String name,int age, double height, double weigth, int salary ,String dept) {
        super(age, height, weigth);
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String information(){
        String str = super.information();
        return str +
                ", dept=" + dept +
                ", salary=" + salary +
                ", name=" + name ;
    }


}
