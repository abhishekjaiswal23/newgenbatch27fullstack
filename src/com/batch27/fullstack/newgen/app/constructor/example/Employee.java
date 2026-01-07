package com.batch27.fullstack.newgen.app.constructor.example;

public class Employee{




        // what it is ?
        // why we are talking about it ? or need ?


    // ans - constructor is a special type of method
    // that is used to initialize the object of a class
    // same name as class name
    // no return type
    // called automatically when object is created
    // can be parameterized or non parameterized




    private int id;
    private String name;
    private double salary;
    private String department;


    public Employee(){
        //super();
       System.out.println("Default Constructor Called");
    }

    public Employee(int id, String name, double salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;

        System.out.println("parameterised Constructor Called");

    }


    public Employee(int id, String name){
        System.out.println("Partial parametrised Constructor Called");
    }



}
