package com.batch27.fullstack.newgen.app.access.modifiers2;

import com.batch27.fullstack.newgen.app.access.modifiers1.A;

// while implementing access specifier in overriding method
// will need to change the access specifier to same or more visible

public class C extends A {
    @Override
    public void m1() {
    //public void m1() {
        super.m1();
    }
}
