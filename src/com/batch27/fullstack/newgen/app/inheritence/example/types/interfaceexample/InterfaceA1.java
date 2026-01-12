package com.batch27.fullstack.newgen.app.inheritence.example.types.interfaceexample;

public interface InterfaceA1 extends InterfaceA2, InterfaceA3, InterfaceA4, InterfaceA5 {

    // interface represent with inyerface keyword
    // interface always implement along class.
    // interface to interface it will always extednd.
    // interface can contain only abstract method.
    // abstract = partial
    // hibrid and multiple inheritance is not supported in java
    // Interfcae reperesent IS-A relationship in object 
    


    // abstarct method = method without body/defination.
    // m0
    // 100% pure bastracttion


    // private - limited abstraction - 0%
    // abstraction = abstract class  - 0 to 100%
    // interfcae  - 100% abstraction

    public void m1();
    public void m2();
    public void m3();
    public void m4();
    public void m5();
    public void m6();


    public void mTest();


    @Override
    void m7();

}
