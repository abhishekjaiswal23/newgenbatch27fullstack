package com.batch27.fullstack.newgen.app.access.modifiers1;

public class A {


    // attribute
    private int i = 10;

    protected void m1() {


        System.out.println("this is coming from class A method m1 output : " + i);
    }


    private void m2(){
        System.out.println("private method");


        System.out.println(i);

    }

    // access modifier or specifier
    // public - accessible everywhere
    // private - accessible within the class
    // protected - accessible within the package and in subclass
    // default - accessible within the package



}
