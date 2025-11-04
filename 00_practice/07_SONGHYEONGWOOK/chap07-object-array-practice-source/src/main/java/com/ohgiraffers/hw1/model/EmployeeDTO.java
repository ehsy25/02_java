package com.ohgiraffers.hw1.model;

public class EmployeeDTO {

    private int empNo;
    private String empName;
    private String dpet;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String Phone;
    private String address;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        Phone = phone;
        this.address = address;
    }

    public EmployeeDTO(int empNo, String empName, String dpet, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dpet = dpet;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.Phone = phone;
        this.address = address;
    }

    public String information() {
        return empNo + ", " + empName + ", " + dpet + ", " + job + ", " + age + ", "
                + gender + ", " + salary + ", " + bonusPoint +  ", " + Phone + ", " + address;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
