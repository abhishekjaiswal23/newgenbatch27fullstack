package com.batch27.fullstack.newgen.app.polymorphism.example;

public class Child extends Parent{

    // overriding hapened in 2 dierrent class
    // cant change method signature or return type
    //


    // public int showMessage(int i) = same method signature
    // can change the definition or body

    @Override // annotation
    public int  showMessage(int i) {
        System.out.println("Message from Child class along with paramter" + i);
        return i * i;

    }

    @Override
    public Long showMessage(int i, String name, String lastname) {
        //return super.showMessage(i, name, lastname);
        return 10L;
    }
}
