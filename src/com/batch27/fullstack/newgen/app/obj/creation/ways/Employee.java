package com.batch27.fullstack.newgen.app.obj.creation.ways;

public class Employee {


    static {
        System.out.println("Employee class loaded");
    }


    public static void main(String[] args)throws Exception {

        // 1st way : using new keyword + constructor
       // class name  reference name    assignment operator    new keyword = assign mememory in jvm heap          constructor
         Employee       employeeTest                 =                   new                         Employee();


        System.out.println("Output : new keyword hashcode.... " + employeeTest.hashCode());


        // 2nd way : using Class.forName() + constructor

        System.out.println("before using Class.forName " );

        System.out.println("Output class .forName " + Class.forName("com.batch27.fullstack.newgen.app.obj.creation.ways.Employee").hashCode());

        System.out.println("after using Class.forName " );



        // 3rd way : using .class + constructor
        // @Deprecated(since = "9")
        Employee emp = Employee.class.newInstance();

        System.out.println("Output using .class " + emp.hashCode());
        // System.out.println(emp.g);


    }

}
