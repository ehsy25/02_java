package com.ohgiraffers.hw1.model.dto;

public class Application {

    public static void main (String[] args) {

        EmployeeDTO[] es = new EmployeeDTO[3];

        EmployeeDTO e1 = new EmployeeDTO();
        EmployeeDTO e2 = new EmployeeDTO(1, "Tommy",
                11, 'F', "1234", "주소1");
        EmployeeDTO e3 = new EmployeeDTO(2, "empName", "dept",
                "job", 3, 'M', 100,
                2.7, "phone", "주소2");

        es[0] = e1;
        es[1] = e2;
        es[2] = e3;

        System.out.println(es[0].getInfo());
        System.out.println(es[1].getInfo());
        System.out.println(es[2].getInfo());


        e1.setEmpNo(0);
        e1.setEmpName("김말똥");
        e1.setDept("영업부");
        e1.setJob("팀장");
        e1.setAge(30);
        e1.setGender('M');
        e1.setSalary(3000);
        e1.setBonusPoint(0.2);
        e1.setPhone("01055559999");
        e1.setAddress("전라도 광주");

        e2.setDept("HR");
        e2.setJob("cop");
        e2.setSalary(1000);
        e2.setBonusPoint(3.0);

        System.out.println("=====================");

        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
        System.out.println(e3.getInfo());


       double wage1 = 12 * ((e1.getSalary()*e1.getBonusPoint()) + e1.getSalary());
       double wage2 = 12 * ( (e2.getSalary()*e2.getBonusPoint()) + e2.getSalary());
       double wage3 = 12 * ((e3.getSalary()*e3.getBonusPoint()) + e3.getSalary());

        System.out.println("sal1: " + wage1);
        System.out.println("sal2: " + wage2);
        System.out.println("sal3: " + wage3);

        double avg = (wage1 + wage2 + wage3)/3;

        System.out.println(avg);

    }
}
