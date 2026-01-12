package com.batch27.fullstack.oop.association.aggregation.composition.example;

public class Department {

    String deptName;
    Employee emp;   // HAS-A relationship

    Department(String deptName, Employee emp) {
        this.deptName = deptName;
        this.emp = emp;
    }

    void showDetails() {
        System.out.println(emp.name + " works in " + deptName);
    }

}
