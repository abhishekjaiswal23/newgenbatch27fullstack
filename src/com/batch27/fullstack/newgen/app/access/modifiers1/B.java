package com.batch27.fullstack.newgen.app.access.modifiers1;

public class B extends A{


//    @Override
//    void m1() {
//        super.m1();
//      //  System.out.println("m1 from method B " + i);
//        System.out.println("m1 from method B ");
//    }


    @Override
    protected void m1() {
        super.m1();
        System.out.println("m1 from method B ");
    }
}
