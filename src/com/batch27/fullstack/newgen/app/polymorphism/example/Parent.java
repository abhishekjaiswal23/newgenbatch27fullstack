package com.batch27.fullstack.newgen.app.polymorphism.example;

public class Parent {


    // meethod oveloading = compile time polymorphism
    // it will hapened with same class methods
    // can change return types

    // public void showMessage() = method signature

    // {
    //        System.out.println("Message from Parent class");
    //    } = method body or definition

    // non parameterized method
    public void showMessage() {
        System.out.println("Message from Parent class");
    }

    // parameterized method
    // covarient return type
    public int showMessage(int i) {
        System.out.println("Message from Parent class along with paramter" + i);
        return i + i;
    }
    // multi parameterized method
    public void showMessage(int i, String name) {
        System.out.println("Message from Parent class along with paramter" + i);
        System.out.println("Message from Parent class along with paramter name : " + name);
    }

    public Long showMessage(int i, String name,String lastname) {
        System.out.println("Message from Parent class along with paramter" + i);
        System.out.println("Message from Parent class along with paramter name : " + name);
        System.out.println("Message from Parent class along with paramter lastname : " + lastname);
        return 10L;
    }




}
