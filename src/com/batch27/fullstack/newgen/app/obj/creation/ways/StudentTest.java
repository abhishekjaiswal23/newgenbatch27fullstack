package com.batch27.fullstack.newgen.app.obj.creation.ways;


// clonable == clone help
// random accaess  == randomly you pick up element
// serializable == object in byte stream

public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();

        System.out.println("------ > s1 " + student1.id);

        Student student2 = (Student) student1.clone();

        System.out.println("------ > s2 " + student2.id);
    }
}
