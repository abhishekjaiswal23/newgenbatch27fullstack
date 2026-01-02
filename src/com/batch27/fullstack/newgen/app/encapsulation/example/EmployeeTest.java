package com.batch27.fullstack.newgen.app.encapsulation.example;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee employee =  new Employee();
        employee.setId(101);
        employee.setName("Prachi");
        employee.setAge(25);
        employee.setDepartment("IT");

        // object class 3 method toString()
        System.out.println("Output for employee : " + employee.toString());
        // Object
        //String id = "100";
        //System.out.println(" outoput for id : " + id.toString());

        System.out.println("Employee Id : " + employee.getId());
        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Employee Age : " + employee.getAge());
        System.out.println("Employee Department : " + employee.getDepartment().toString());

// sortoing









        // user
        // id
        // username
        // salary 10000
        // printing in should increase by 10%
        // print 11000






    }
}
