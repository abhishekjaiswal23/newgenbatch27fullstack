package com.batch27.fullstack.oop.association.aggregation.composition.example;

public class TestAggregation {
    public static void main(String[] args) {
        Employee emp = new Employee("Abhishek");
        Department dept = new Department("IT", emp);

        dept.showDetails();
    }
}
