package com.batch27.fullstack.newgen.app.polymorphism.example;

public class PolymorphismTest {

    public static void main(String[] args) {


        Parent parent = new Parent();
        parent.showMessage(10, "John");


        int sum = parent.showMessage(10);

        System.out.println("Sum returned from parent class method: " + sum);




        Child child = new Child();
        child.showMessage(10);



    }
    // poly ====== many
    // morphism ==== forms
    // works on object and methods level

    // can create multiple form of object and methods

    // polymorphism = many forms
    // 1. compile time polymorphism / method overloading / static polymorphism / static binding
    // 2. runtime polymorphism/ method overriding / dynamic polymorphism / dynamic binding
    // real time examples
    // vehicle
    // car







}








