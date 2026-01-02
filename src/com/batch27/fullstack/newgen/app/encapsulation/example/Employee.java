package com.batch27.fullstack.newgen.app.encapsulation.example;

public class Employee {

    // encapsulation -
    // wrapping up the data in such away that not other user can misuse it.
    // real time example - cucumber, phone, laptop, car, bike, medicine tablet.
    // technical example - employee, student, customer.
    private int id;// 101
    private String name;// "Prachi"
    private int age;// 25
    private String department; // "IT"

    // getter and setter methods
//    public int getId() {
//        return id;
//    }

    // standard formate of getter method
//    public int getXXX() {
//        return id;
//    }
    // getter method
    public int getId() {
        return id;
    }
    // setter method
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }





    // laptop
    // brand - Dell
    // model - Inspiron
    // price - 50000
    // color - black
    // ram - 8GB

    // car
    // brand - Hyundai
    // model - Creta
    // price - 15L
    // color - black
    // type - hybrid


    // to String() method

    @Override
    public String toString() {
        return "Employee{--------- >>>> " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
