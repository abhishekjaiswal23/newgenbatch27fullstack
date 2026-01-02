package com.batch27.fullstack.newgen.app.inheritence.example;



// child class

public class B extends A{


    @Override
    public void display() {

        System.out.println("veribale access : " + super.i);

        super.display();

       // System.out.println("This is class B");

    }
}
