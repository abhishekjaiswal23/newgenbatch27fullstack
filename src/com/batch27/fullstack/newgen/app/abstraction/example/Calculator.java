package com.batch27.fullstack.newgen.app.abstraction.example;

public abstract class Calculator {


    public Calculator(){
        System.out.println("This is constructor of Calculator class");
    }

    public void addition(){
        System.out.println("This is addition method");
    }
    public void substraction(){
        System.out.println("This is substraction method");
    }
    public abstract void multiply();
    public abstract void division();



}
