package com.batch27.fullstack.newgen.app.oops;

// object = see,touch,feel
//  class is blue print object Pen/ Ball/ Car
// public = access modifier
//
// class = reserve keyword to represent class
public class ClassExample {


    // void == no return type
    // return type = it will some values
    // int , string list<Eployee>, Class etc

    // access peciifer  keywrord     return    main method name     string of array   in arguments
    public static void maintest(String[] args) {
        System.out.println("from main method...");
        ClassExample.m1();
    }

    // if i want to write my own main method
    // what should i do
    // what changes i should do?
    // and where i can do ?




    // static block 2
    // method 3
    // variable 1 initialization in preapare or lkinking

    // when it will get executed...
    static {
        System.out.println("Instance block 1");
    }

    static int i = 10;

    static {
        System.out.println("Instance block 2");
    }

    public static void m1(){
        System.out.println("coming from m1 static method..." + i);
    }




}

