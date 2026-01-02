package com.batch27.fullstack.newgen.app.inheritence.example.types.multilevel;

public class C extends B{
    @Override
    void display() {
        super.display();
        System.out.println("This is class C");
    }
}
