package com.ohgiraffers.hw1.model.dto;

import com.ohgiraffers.hw1.run.Application;

public class EmployeeDTO {

    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    public int salary;
    public double bonusPoint;
    private String phone;
    private String address;

    public EmployeeDTO() {}

    public EmployeeDTO(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public EmployeeDTO(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }


    public String getInformation() {
        return
                 empNo + ", " +
                 empName + ", " +
                 dept + ", " +
                 job + ", " +
                 age + ", " +
                 gender + ", " +
                 salary + ", " +
                 bonusPoint + ", " +
                 phone + ", " +
                 address
                ;
    }

    public int getYearlySalary(){
        return (int)((salary + ( salary * bonusPoint)) * 12);
    }
}
