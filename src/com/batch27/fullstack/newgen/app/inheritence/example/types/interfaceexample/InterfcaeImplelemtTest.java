package com.batch27.fullstack.newgen.app.inheritence.example.types.interfaceexample;

public class InterfcaeImplelemtTest implements InterfaceA1 {


    // errror - Class 'InterfcaeImplelemtTest' must either be declared abstract
    // or implement abstract method 'm1()' in 'InterfaceA1'


    @Override
    public void m1() {
        System.out.println("Implementation of m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Implementation of m2 method");
    }

    @Override
    public void m3() {
        System.out.println("Implementation of m3 method");
    }

    @Override
    public void m4() {
        System.out.println("Implementation of m4 method");
    }

    @Override
    public void m5() {
        System.out.println("Implementation of m5 method");
    }

    @Override
    public void m6() {
        System.out.println("Implementation of m6 method");
    }

    @Override
    public void m7() {
        System.out.println("Implementation of m7 method");
    }

    @Override
    public void m0() {
        System.out.println("Implementation of m0 method");
    }


    @Override
    public void m8() {
        System.out.println("Implementation of m8 method");
    }

    public static void main(String[] args) {
        InterfcaeImplelemtTest obj = new InterfcaeImplelemtTest();


        // it will calll to m8 method
        obj.m8();


    }




}
