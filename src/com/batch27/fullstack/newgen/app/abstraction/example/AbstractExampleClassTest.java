package com.batch27.fullstack.newgen.app.abstraction.example;

public class AbstractExampleClassTest {

    // 0-100% completed implementation

    // instatiate the object

    //
    // abstract = paratiaal or incomplete implementation
    // abstract class cannot be instantiated, cant reach to object class
    // due to incomplete implementation
    // abstract class has abstract and non - abstract methods
    //

    // conceret class

    // concret method
    public void concreteMethod() {
        System.out.println("This is a concrete method in the abstract class.");
    }
    // abstract method
    // public abstract void abstractMethod();





    public static void main(String[] args) {

        //Calculator c; //=  new Calculator();

        //c.multiply();

        CaclulatorAdvance c = new CaclulatorAdvance();

        c.multiply();


    }



}
