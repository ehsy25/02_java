package com.greedy.level03.hard.emp.run;
import com.greedy.level03.hard.emp.model.dto.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String dept = sc.nextLine();
        String job = sc.nextLine();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        sc.nextLine();
        int salary = sc.nextInt();
        sc.nextLine();
        double bonus = sc.nextDouble();
        sc.nextLine();
        String phone = sc.nextLine();
        String address = sc.nextLine();

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setGender(gender);
        employeeDTO.setAddress(address);
        employeeDTO.setNumber(number);
        employeeDTO.setBonusPoint(bonus);
        employeeDTO.setAge(age);
        employeeDTO.setPhone(phone);
        employeeDTO.setSalary(salary);

        System.out.println("Number : " + employeeDTO.getNumber());
        System.out.println("Name : " + employeeDTO.getName());
        System.out.println("Dept : " + employeeDTO.getDept());
        System.out.println("Job : " + employeeDTO.getJob());
        System.out.println("Age : " + employeeDTO.getAge());
        System.out.println("Gender : " + employeeDTO.getGender());
        System.out.println("Salary : " + employeeDTO.getSalary());
        System.out.println("Bonus : " + employeeDTO.getBonusPoint());
        System.out.println("Phone : " + employeeDTO.getPhone());
        System.out.println("Address : " + employeeDTO.getAddress());

    }
}
