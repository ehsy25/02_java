package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("number: ");
        int number = sc.nextInt();
        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("dept: ");
        String dept = sc.nextLine();
        System.out.println("job: ");
        String job = sc.nextLine();
        System.out.println("age: ");
        int age = sc.nextInt();
        System.out.println("gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("salary: ");
        int salary = sc.nextInt();
        System.out.println("bonusPoint: ");
        double bonusPoint = sc.nextDouble();
        System.out.println("phone: ");
        String phone = sc.nextLine();
        System.out.println("address: ");
        String address = sc.nextLine();

        EmployeeDTO employee = new EmployeeDTO();
        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setSalary(salary);
        employee.setBonusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAdress(address);

        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAdress());





    }
}