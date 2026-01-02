package com.batch27.fullstack.newgen.app.obj.creation.ways;


// marker of tagged intefercae
// clone = copy
public class Student implements Cloneable {
    int id = 101;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}





